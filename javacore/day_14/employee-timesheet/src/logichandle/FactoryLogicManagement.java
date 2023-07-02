package logichandle;

import entity.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactoryLogicManagement {
    private final List<Factory> factories = new ArrayList<>();

    public List<Factory> getFactories() {
        return factories;
    }

    public void showFactory() {
        System.out.println(factories);
    }

    public void inputNewFactory() {
        System.out.println("Bạn muốn thêm mới bao nhiêu nhà máy: ");
        int factoryNumber = inputNumberOfFactory();

        for (int i = 0; i < factoryNumber; i++) {
            System.out.println("Nhập thông tin nhà máy thứ " + ( i + 1));
            Factory factory = new Factory();
            factory.inputInfo();
            factories.add(factory);
        }
    }

    public int inputNumberOfFactory() {
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
}
