package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class option2 extends Starter {
    public static void option2() {
            String connectionUrl="jdbc:postgresql://localhost:5432/Schedule";
            Connection connection = null;
            ResultSet resultSet = null;
            Statement statement = null;
            String command2=null;
            Scanner input= new Scanner(System.in);
            try{
                while(true) {
                        System.out.println(" ");
                        System.out.println("Enter your ticket_id:");
                        String ticket_id= input.nextLine();
                        command2="select customer.first_name, customer.last_name, flight.airline_name, flight.from_location, flight.to_location, flight.departure_time, flight.arrival_time, flight_details.flight_date\n" +
                                "from ticket\n" +
                                "inner join customer on customer.customer_id = ticket.customer_id \n" +
                                "inner join flight on flight.flight_id = ticket.flight_id\n" +
                                "inner join flight_details on flight_details.flight_date = ticket.flight_date\n" +
                                "where ticket_id = "+ ticket_id;
                        try {
                            Class.forName("org.postgresql.Driver");
                            connection= DriverManager.getConnection(connectionUrl,"postgres","0000");
                            statement=connection.createStatement();
                            resultSet=statement.executeQuery(command2);
                            while(resultSet.next()){
                                System.out.println("Your Ticket: " + resultSet.getInt("first_name") + resultSet.getString("from_location") + resultSet.getString("to_location") + resultSet.getString("flight_date") + resultSet.getString("departure_time")+"   Price: "+resultSet.getString("price"));
                            }
                        }catch (Exception e){
                            System.out.println(e);
                        }
                        System.out.println("---------------------------------");
                        System.out.println("");
                    }

                }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }