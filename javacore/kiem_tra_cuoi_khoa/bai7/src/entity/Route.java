package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Route {
    public static int AUTO_ID = 100;
    private int routeId;
    private double distance;
    private int point;

    public Route() {
        this.routeId = AUTO_ID;
        AUTO_ID++;
    }


    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeId=" + routeId +
                ", distance=" + distance +
                ", point=" + point +
                '}';
    }

    public void inputInfor() {
        do {
            try {
                System.out.println("Nhập khoảng cách: ");
                double dist = new Scanner(System.in).nextDouble();
                this.setDistance(dist);
                if (dist > 0) {
                    break;
                } else {
                    System.out.println("Khoảng cách phải lớn hơn 0, vui lòng nhập lại!");
                }
            }catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập số điểm dừng: ");
                int count = new Scanner(System.in).nextInt();
                this.setPoint(count);
                if (count > 0) {
                    break;
                } else {
                    System.out.println("Số điểm dừng phải lớn hơn 0, vui lòng nhập lại!");
                }
            }catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
            }
        } while (true);
    }
}
