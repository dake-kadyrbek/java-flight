package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class option3 extends Starter{
    public static void option3() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Schedule";
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        String command3 = null;
        Scanner input = new Scanner(System.in);
        while (true) {
                System.out.println(" ");
                System.out.println("Enter your ticket_id:");
                String ticket_id = input.nextLine();
                    command3 = "DELETE FROM ticket\n" +
                        "WHERE ticket_id ='" + ticket_id + "'";
                try {
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(connectionUrl, "postgres", "0000");
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery(command3);
                    while (resultSet.next()) {
                        System.out.println("Your flight cancelled");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("-----------------------------");
                System.out.println("");
            }
        }
    }
