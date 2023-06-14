import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerCard managerCard = new ManagerCard();
        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.println("Application Manager Card");
            System.out.println("Enter 1: To insert card");
            System.out.println("Enter 2: To delete card");
            System.out.println("Enter 3: To show infor card");
            System.out.println("Enter 4: To quit");

            String choose = sc.nextLine();
            switch (choose) {
                case "1": {
                    System.out.println("Enter id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter day borrow: ");
                    String dayBorrow = sc.nextLine();
                    System.out.println("Enter day payment: ");
                    String dayPayment = sc.nextLine();
                    System.out.println("Enter book id: ");
                    String bookId = sc.nextLine();
                    System.out.println("Enter name of student: ");
                    String name = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter school: ");
                    String school = sc.nextLine();

                    Student student = new Student(name, age, school);
                    Card card = new Card(id, dayBorrow, dayPayment, bookId, student);

                    managerCard.addCard(card);
                    System.out.println(card.toString());
                    break;
                }

                case "2": {
                    System.out.println("Enter id want to");
                    String id = sc.nextLine();
                    System.out.println(managerCard.deleteCard(id)? "Success" : "Fail");
                    break;
                }

                case "3": {
                    managerCard.showInforCard();
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
