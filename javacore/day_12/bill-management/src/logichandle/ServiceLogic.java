package logichandle;

import entity.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceLogic {
    private Service[] services = new Service[100];

    public Service[] getServices() {
        return services;
    }

    public  void showService() {
        for (int i = 0; i < services.length; i++ ){
            if (services[i] != null) {
                System.out.println(services[i]);
            }
        }
    }

    public  void inputNewService() {
        System.out.println("Bạn muốn thêm mới bao nhiêu dịch vụ: ");
        int serviceNumber;

        do {
            try {
                serviceNumber = new Scanner(System.in).nextInt();
                if (serviceNumber >= 1) {
                    break;
                } else
                    System.out.println("Số dịch vụ phải lớn hơn hoặc bằng 1");
            } catch (InputMismatchException e) {
                System.out.println("Định dạnh không hợp lệ, vui lòng nhập lại");
            }

        } while (true);

        for (int i = 0; i < serviceNumber ; i++) {
            System.out.println("Nhập thông tin dịch vụ " + (i + 1));
            Service service = new Service();
            service.inputInfo();

            saveService(service);
        }
    }

    public  void saveService(Service service) {
        for (int i = 0; i < services.length; i++) {
            if (services[i] == null) {
                services[i] = service;
                break;
            }
        }
    }

    public boolean isHasService(Service[] services) {
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null) {
                return true;
            }
        }
        return false;
    }
}
