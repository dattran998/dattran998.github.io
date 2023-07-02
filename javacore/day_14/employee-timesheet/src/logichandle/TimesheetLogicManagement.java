package logichandle;

import entity.Employee;
import entity.Factory;
import entity.Timesheet;
import entity.TimesheetDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimesheetLogicManagement {
    private EmployeeLogicManagement employeeLogicManagement;
    private FactoryLogicManagement factoryLogicManagement;
    private final List<Timesheet> timesheets = new ArrayList<>();

    public TimesheetLogicManagement(EmployeeLogicManagement employeeLogicManagement, FactoryLogicManagement factoryLogicManagement) {
        this.employeeLogicManagement = employeeLogicManagement;
        this.factoryLogicManagement = factoryLogicManagement;
    }

    public void calculateSalary() {
        if (timesheets.isEmpty()) {
            System.out.println("Chưa có dữ liệu để tính toán, mời nhập dữ liệu");
        }
        for (int i = 0; i < timesheets.size(); i++) {
            double salary = 0;

            for(int j = 0; j < timesheets.get(i).getDetails().size(); j++) {
                salary += (45000 * timesheets.get(i).getEmployee().getLevel() * timesheets.get(i).getDetails().get(j).getFactory().getCoefficient() * (timesheets.get(i).getDetails().get(j).getDay() / 22.0));
            }

            System.out.println("Lương của công nhân " + timesheets.get(i).getEmployee().getName() + " là " + salary);
        }
    }

    public void sortByName() {
        if (timesheets.isEmpty()) {
            System.out.println("Chưa có dữ liệu để sắp xếp, nhập dữ liệu trước khi sắp xếp");
            return;
        }

        for (int i = 0; i < timesheets.size() - 1; i++) {
            for (int j = i + 1; j < timesheets.size(); j++) {
                if (timesheets.get(i).getEmployee().getName().compareToIgnoreCase(timesheets.get(j).getEmployee().getName()) > 0) {
                    Timesheet timesheet = timesheets.get(i);
                    timesheets.set(i, timesheets.get(j));
                    timesheets.set(j, timesheet);
                }
            }
        }

        showTimesheet();
    }

    public void showTimesheet() {
//        System.out.println(timesheets);
        for (int i = 0; i < timesheets.size(); i++) {
            System.out.println(timesheets.get(i));
        }
    }

    public void inputNewTimesheet() {
        if (employeeLogicManagement.getEmployees().isEmpty() || factoryLogicManagement.getFactories().isEmpty()) {
            System.out.println("Không có dữ liệu để lập bảng chấm công, yêu cầu tạo dữ liêu trước");
            return;
        }
        System.out.println("Bạn muốn thêm mới bao nhiêu công nhân vào bảng chấm công: ");
        int timesheetNumber = inputNumberofTimesheet();

        for (int i = 0; i < timesheetNumber; i++) {
            System.out.println("Nhập thông tin công nhân thứ " + (i + 1) + ":");
            System.out.println("Nhập id công nhân: ");
            int employeeId;
            Employee employee = null;
            do {
                try {
                    employeeId = new Scanner(System.in).nextInt();
                    for (int j = 0; j < employeeLogicManagement.getEmployees().size(); j++) {
                        if (employeeLogicManagement.getEmployees().get(j).getId() == employeeId) {
                            employee = employeeLogicManagement.getEmployees().get(i);
                            break;
                        }
                    }

                    if (employee != null) {
                        break;
                    } else {
                        System.out.println("ID vừa nhập không hợp lệ vui lòng nhập lại");
                    }
                } catch (Exception e) {
                    System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
                }
            } while (true);

            System.out.println("Công nhân thứ " + (i + 1) +" làm ở mấy nhà máy: ");
            int factoryNumber = factoryLogicManagement.inputNumberOfFactory();
            List<TimesheetDetail> details = new ArrayList<>();
            int totalDay = 0;

            for (int j = 0; j < factoryNumber ; j++) {
                System.out.println("Nhập ID nhà máy thứ " + (j + 1) +":");
                int factoryId;
                Factory factory = null;
                do {
                    try {
                        factoryId = new Scanner(System.in).nextInt();
                        for (int k = 0; k < factoryLogicManagement.getFactories().size(); k++) {
                            if (factoryLogicManagement.getFactories().get(k).getFactoryId() == factoryId) {
                                factory = factoryLogicManagement.getFactories().get(k);
                                break;
                            }
                        }

                        if (factory != null) {
                            break;
                        } else {
                            System.out.println("ID vừa nhập không hợp lệ vui lòng nhập lại");
                        }
                    } catch (Exception e) {
                        System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
                    }
                } while (true);

                System.out.println("Nhà máy thứ " + (j + 1) + " làm bao nhiêu ngày: ");
                int day;

                do {
                    try {
                        day = new Scanner(System.in).nextInt();
                        int temp = totalDay;
                        temp+= day;
                        if (temp > 0 && temp <= 30) {
                            break;
                        }
                        else {
                            System.out.println("Tổng số ngày làm việc trong tháng của 1 người không được vượt quá 30, vui lòng nhập lại");
                        }
                    } catch (Exception e) {
                        System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
                    }
                } while (true);

                totalDay += day;

                TimesheetDetail timesheetDetail = new TimesheetDetail(factory, day);
                details.add(timesheetDetail);

            }

            Timesheet timesheet = new Timesheet(employee, details);
            timesheets.add(timesheet);
        }
    }

    public int inputNumberofTimesheet() {
        int timesheetNumber;
        do {
            try {
                timesheetNumber = new Scanner(System.in).nextInt();
                if (timesheetNumber >= 1) {
                    break;
                }
                else
                    System.out.println("Số công nhân  thêm mới vào bảng chấm công phải là số nguyên dương, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        return timesheetNumber;
    }


}
