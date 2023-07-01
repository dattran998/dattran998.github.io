package main;

import entity.Employee;
import entity.Factory;
import entity.Timesheet;
import entity.TimesheetDetail;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Employee> employees = new ArrayList<>();
    private static List<Factory> factories = new ArrayList<>();
    private static List<Timesheet> timesheets = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        do {
            showMenuContent();
            int choice = inputChoice();

            switch (choice) {
                case 1:
                    inputNewEmployee();
                    break;

                case 2:
                    showEmployee();
                    break;

                case 3:
                    inputNewFactory();
                    break;

                case 4:
                    showFactory();
                    break;

                case 5:
                    inputNewTimesheet();
                    break;
                case 6:
                    showTimesheet();
                    break;

                case 7:
                    showSortMenu();
                    break;

                case 8:
                    calculateSalary();
                    break;

                case 9:

                    return;


            }


        } while (true);
    }

    private static void calculateSalary() {
        if (timesheets.isEmpty()) {
            System.out.println("Chưa có dữ liệu để tính toán, mời nhập dữ liệu");
        }
        for (int i = 0; i < timesheets.size(); i++) {
            int salary = 0;

            for(int j = 0; j < timesheets.get(i).getDetails().size(); j++) {
                salary += (45000 * timesheets.get(i).getEmployee().getLevel() * timesheets.get(i).getDetails().get(j).getFactory().getCoefficient() * (timesheets.get(i).getDetails().get(j).getDay() / 22));
            }

            System.out.println("Lương của công nhân " + timesheets.get(i).getEmployee().getName() + " là " + salary);
        }
    }

    private static void showSortMenu() {
        System.out.println("1. Sắp xếp theo tên công nhân");
        System.out.println("2. Sắp xếp theo xưởng");
        System.out.println("3. Trở về menu chính");
        System.out.println("Mời chọn: ");
        
        int subChoice = inputSubChoice();
        
        switch (subChoice) {
            case 1: 
                sortByName();
                break;

            case 2:

                break;

            case 3:

                return;
        }
    }


    private static void sortByName() {
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

    private static int inputSubChoice() {
        int subChoice;
        do {
            try {
                subChoice = new Scanner(System.in).nextInt();
                if (subChoice >= 1 && subChoice <= 3) {
                    break;
                }
                else
                    System.out.println("Lựa chọn từ 1 đến 3, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        return subChoice;
    }

    private static void showTimesheet() {
//        System.out.println(timesheets);
        for (int i = 0; i < timesheets.size(); i++) {
            System.out.println(timesheets.get(i));
        }
    }

    private static void inputNewTimesheet() {
        if (employees.isEmpty() || factories.isEmpty()) {
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
                    for (int j = 0; j < employees.size(); j++) {
                        if (employees.get(j).getId() == employeeId) {
                            employee = employees.get(i);
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
            int factoryNumber = inputNumberOfFactory();
            List<TimesheetDetail> details = new ArrayList<>();
            int totalDay = 0;

            for (int j = 0; j < factoryNumber ; j++) {
                System.out.println("Nhập ID nhà máy thứ " + (j + 1) +":");
                int factoryId;
                Factory factory = null;
                do {
                    try {
                        factoryId = new Scanner(System.in).nextInt();
                        for (int k = 0; k < factories.size(); k++) {
                            if (factories.get(k).getFactoryId() == factoryId) {
                                factory = factories.get(k);
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

    private static int inputNumberofTimesheet() {
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

    private static void showFactory() {
        System.out.println(factories);
    }

    private static void inputNewFactory() {
        System.out.println("Bạn muốn thêm mới bao nhiêu nhà máy: ");
        int factoryNumber = inputNumberOfFactory();

        for (int i = 0; i < factoryNumber; i++) {
            System.out.println("Nhập thông tin nhà máy thứ " + ( i + 1));
            Factory factory = new Factory();
            factory.inputInfo();
            factories.add(factory);
        }
    }

    private static int inputNumberOfFactory() {
        int factoryNumber;
        do {
            try {
                factoryNumber = new Scanner(System.in).nextInt();
                if (factoryNumber >= 1) {
                    break;
                }
                else
                    System.out.println("Số nhà máy thêm mới phải là số nguyên dương, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        return factoryNumber;
    }

    private static void showEmployee() {
        System.out.println(employees);
    }

    private static void inputNewEmployee() {
        System.out.println("Bạn muốn thêm mới bao nhiêu công nhân: ");
        int employeeNumber = inputNumberOfEmployee();

        for (int i = 0; i < employeeNumber; i++) {
            System.out.println("Nhập thông tin công nhân thứ " + (i + 1));
            Employee employee = new Employee();
            employee.inputInfo();
            employees.add(employee);
        }
    }

    private static int inputNumberOfEmployee() {
        int employeeNumber;
        do {
            try {
                employeeNumber = new Scanner(System.in).nextInt();
                if (employeeNumber >= 1) {
                    break;
                }
                else
                    System.out.println("Số công nhân thêm mới phải là số nguyên dương, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        return employeeNumber;


    }

    private static int inputChoice() {
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 9) {
                    break;
                }
                else
                    System.out.println("Lựa chọn từ 1 đến 9, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        return choice;
    }

    private static void showMenuContent() {
        System.out.println("============BẢNG DANH SÁCH CHẤM CÔNG============");
        System.out.println("1. Nhập danh sách công nhân mới");
        System.out.println("2. In ra danh sách công nhân đã có");
        System.out.println("3. Nhập danh sách xưởng sản xuất ");
        System.out.println("4. In ra danh sách xưởng đã có");
        System.out.println("5. Lập bảng danh sách chấm công");
        System.out.println("6. In ra bảng danh sách chấm công");
        System.out.println("7. Sắp xếp bảng danh sách chấm công");
        System.out.println("8. Lập bảng kê thu nhập mỗi công nhân trong tháng");
        System.out.println("9. Thoát chương trình");
        System.out.println("Mời chọn: ");
    }
}
