import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();

        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: to insert new officer");
            System.out.println("Enter 2: to search officer by name");
            System.out.println("Enter 3: to show information officer");
            System.out.println("Enter 4: to exit");
            String line = sc.nextLine();

            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert new worker");
                    System.out.println("Enter b: to insert new engineer");
                    System.out.println("Enter c: to insert new staff");

                    String choose = sc.nextLine();

                    switch (choose) {
                        case ("a"): {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("String age: ");
                            int age = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter gender: ");
                            String gender = sc.nextLine();
                            System.out.println("Enter address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter level: ");
                            int level = sc.nextInt();
                            sc.nextLine();

                            Officer worker = new Worker(name, age, gender, address, level);

                            managerOfficer.addOfficer(worker);
                            worker.show();
                            break;
                        }

                        case ("b"): {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("String age: ");
                            int age = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter gender: ");
                            String gender = sc.nextLine();
                            System.out.println("Enter address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter branch: ");
                            String branch = sc.nextLine();

                            Officer engineer = new Engineer(name, age, gender, address, branch);

                            managerOfficer.addOfficer(engineer);
                            engineer.show();
                            break;
                        }

                        case ("c"): {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("String age: ");
                            int age = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter gender: ");
                            String gender = sc.nextLine();
                            System.out.println("Enter address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter task: ");
                            String task = sc.nextLine();

                            Officer staff = new Staff(name, age, gender, address, task);

                            managerOfficer.addOfficer(staff);
                            staff.show();
                            break;
                        }

                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }

                case "2": {
                    System.out.println("Enter name to search: ");
                    String name = sc.nextLine();
                    managerOfficer.searchByName(name).forEach(officer -> officer.show());
                    break;
                }

                case "3": {
                    managerOfficer.showListInforOfficer();
                    break;
                }

                case "4": {
                    return;
                }

                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
