package logichandle;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeLogicManagement {
    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void showEmployee() {
        System.out.println(employees);
    }

    public void inputNewEmployee() {
        System.out.println("Bạn muốn thêm mới bao nhiêu công nhân: ");
        int employeeNumber = inputNumberOfEmployee();

        for (int i = 0; i < employeeNumber; i++) {
            System.out.println("Nhập thông tin công nhân thứ " + (i + 1));
            Employee employee = new Employee();
            employee.inputInfo();
            employees.add(employee);
        }
    }

    public int inputNumberOfEmployee() {
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

}
