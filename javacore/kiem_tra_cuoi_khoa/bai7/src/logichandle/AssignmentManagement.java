package logichandle;

import entity.Assignment;
import entity.AssignmentDetail;
import entity.Driver;
import entity.Route;
import jdk.internal.util.xml.impl.Input;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AssignmentManagement {
    private final List<Assignment> assignments = new ArrayList<>();
    private DriverManagement driverManagement;
    private RouteManagement routeManagement;


    public AssignmentManagement(DriverManagement driverManagement, RouteManagement routeManagement) {
        this.driverManagement = driverManagement;
        this.routeManagement = routeManagement;
    }

    public void calculateTotalDistance() {
        if (assignments.isEmpty()) {
            System.out.println("Chưa có dữ liệu để tính toán, vui lòng nhập dữ liệu trước khi sắp xếp");
            return;
        }
        int totalDistance = 0;
        for (int i = 0; i < assignments.size(); i++) {
            totalDistance = 0;
            for (int j = 0; j < assignments.get(i).getDetails().size(); j++) {
                totalDistance += assignments.get(i).getDetails().get(j).getRoute().getDistance() * assignments.get(i).getDetails().get(j).getQuantity();
            }
            System.out.println("Tổng khoảng cách chạy xe trong ngày của lái xe " + assignments.get(i).getDriver().getName() + " là: " + totalDistance);
            try {
                FileWriter writer = new FileWriter("Total_distance.txt");
                writer.write("Tổng khoảng cách chạy xe trong ngày của lái xe " + assignments.get(i).getDriver().getName() + " là: " + totalDistance + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void sortByRoute() {
        if (assignments.isEmpty()) {
            System.out.println("Chưa có dữ liệu để sắp xếp, vui lòng nhập dữ liệu trước khi sắp xếp");
            return;
        }
        Collections.sort(assignments, new Comparator<Assignment>() {
            @Override
            public int compare(Assignment o1, Assignment o2) {
                return Integer.compare(o2.getTotalRoute(), o1.getTotalRoute());
            }
        });
    }

    public void sortByName() {
        if (assignments.isEmpty()) {
            System.out.println("Chưa có dữ liệu để sắp xếp, vui lòng nhập dữ liệu trước khi sắp xếp");
            return;
        }
        Collections.sort(assignments, new Comparator<Assignment>() {
            @Override
            public int compare(Assignment o1, Assignment o2) {
                return o1.getDriver().getName().compareToIgnoreCase(o2.getDriver().getName());
            }
        });
    }
    public void inputNewAssignment() {

        if (driverManagement.getDrivers().isEmpty() || routeManagement.getRoutes().isEmpty()) {
            System.out.println("Chưa có đủ dữ liệu để thêm mới danh sách phân công!");
            return;
        }

        System.out.println("Bạn muốn thêm mới bao nhiêu danh sách phân công: ");
        int assignmentNumber = inputNumberOfAssignment();

        for (int i = 0; i < assignmentNumber; i++) {
            System.out.println("Nhập thông tin danh sách phân công thứ " + (i + 1) + ":");
            System.out.println("Nhập ID lái xe: ");
            int driverId = 0;

            Driver driver = null;
            do {
                try {
                    driverId = new Scanner(System.in).nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
                }

                for (int j = 0; j < driverManagement.getDrivers().size(); j++) {
                    if (driverManagement.getDrivers().get(j).getIdDriver() == driverId) {
                        driver = driverManagement.getDrivers().get(j);
                    }
                }

                if (driver != null) {
                    break;
                } else {
                    System.out.println("Không tìm thấy ID lái xe vừa nhập, vui lòng nhập lại!");
                }
            } while (true);

            System.out.println("Lái xe này chạy bao nhiêu tuyến: ");
            int routeNumber = inputNumberOfRoute();
            List<AssignmentDetail> details = new ArrayList<>();
            int totalQuantity = 0;
            for (int j = 0; j < routeNumber; j++) {
                System.out.println("Nhập ID tuyến thứ " + (j + 1) + ":");

                int routeId = 0;

                Route route = null;
                do {
                    try {
                        routeId = new Scanner(System.in).nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
                    }

                    for (int k = 0; k < routeManagement.getRoutes().size(); k++) {
                        if (routeManagement.getRoutes().get(k).getRouteId() == routeId) {
                            route = routeManagement.getRoutes().get(k);
                        }
                    }

                    if (route != null) {
                        break;
                    } else {
                        System.out.println("Không tìm thấy ID tuyến đường vừa nhập, vui lòng nhập lại!");
                    }
                } while (true);

                System.out.println("Tuyến đường này chạy bao nhiêu lượt: ");
                int quantity = 0;
                do {
                    try {
                        quantity = new Scanner(System.in).nextInt();
                        int temp = totalQuantity;
                        temp += quantity;
                        if (temp <= 15 && quantity > 0) {
                            break;
                        } else {
                            System.out.println("Nếu chạy thêm " + quantity + " lượt thì tổng số chuyến sẽ lớn hơn 15, vui lòng nhập lại!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
                    }
                } while (true);

                totalQuantity += quantity;
                AssignmentDetail assignmentDetail = new AssignmentDetail(route, quantity);
                details.add(assignmentDetail);
            }
            Assignment assignment = new Assignment(driver, details, routeNumber);
            assignments.add(assignment);
        }
    }

    public void showAssignment() {
        for (Assignment x : assignments) {
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
                    System.out.println("Tổng số tuyến phải lớn hơn 0, vui lòng nhập lại!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
            }
        } while (true);
        return n;
    }

    private int inputNumberOfAssignment() {
        int n;
        do {
            try {
                n = new Scanner(System.in).nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Số danh sách phân công thêm mới phải lớn hơn 0, vui lòng nhập lại!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
            }
        } while (true);
        return n;
    }

}
