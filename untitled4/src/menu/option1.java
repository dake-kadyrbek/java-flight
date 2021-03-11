package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class option1 extends Starter{
    void option1() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Schedule";
        Connection connection = null;
        Statement statement = null;
        String command1_1 = null;
        String command1_2 = null;
        List list = new List();
        Scanner input = new Scanner(System.in);
                System.out.println("Enter your first name:");
                String name1 = input.nextLine();
                System.out.println("Enter your last name:");
                String name2 = input.nextLine();
                System.out.println("Enter your phone number:");
                String phoneNumber1 = input.nextLine();
                System.out.println("Enter your email:");
                String email = input.nextLine();
                System.out.println("Choose your flight by id:");
                String flight_id = input.nextLine();
                List.getList();
                int id = input.nextInt();
                command1_1 = "insert into customer(first_name, last_name, tel_number, email)  VALUES(" + "'" + name1 + "'," + "'" + name2 + "'," + "'" + phoneNumber1 + "'," + "'" + email + "')";
                command1_2 = "INSERT INTO ticket(customer_id) VALUES(" + id + ")" + "INSERT INTO ticket(ticket_id) VALUES(" + id + ")" + "INSERT INTO ticket(flight_id) VALUES(" + flight_id + ")";
                try {
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(connectionUrl, "postgres", "0000");
                    statement = connection.createStatement();
                    statement.executeQuery(command1_1);

                } catch (Exception e) {
                    System.out.println(e);
                }
                try {
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(connectionUrl, "postgres", "0000");
                    statement = connection.createStatement();
                    statement.executeQuery(command1_2);

                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("You have successfully placed an order!");
                System.out.println("------------------------------------");
                System.out.println("");
            }
        }