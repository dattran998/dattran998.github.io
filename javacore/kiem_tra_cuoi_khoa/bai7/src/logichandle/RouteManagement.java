package logichandle;

import entity.Route;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RouteManagement {
    private List<Route> routes = new ArrayList<>();

    public List<Route> getRoutes() {
        return routes;
    }

    public void inputNewRoute() {
        System.out.println("Bạn muốn thêm mới bao nhiêu tuyến đường: ");
        int routeNumber = inputNumberOfRoute();

        for (int i = 0; i < routeNumber; i++) {
            Route route = new Route();
            System.out.println("Nhập thông tin tuyến đường thứ " + (i + 1) + ":");
            route.inputInfor();
            routes.add(route);
        }
    }

    public void showRoute() {
        for (Route x : routes) {
            System.out.println(x.toString());
        }
    }

    private int inputNumberOfRoute() {
        int n;
        do {
            try {
                n = new Scanner(System.in).nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Số tuyến đường thêm mới phải lớn hơn 0, vui lòng nhập lại!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
            }
        } while (true);
        return n;
    }
}
