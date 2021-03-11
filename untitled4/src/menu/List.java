package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class List {
    public static void getList() {
        String connectionUrl="jdbc:postgresql://localhost:5432/Schedule";
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(connectionUrl,"postgres","0000");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT flight.airline_name, flight.from_location, flight.to_location, flight.departure_time, flight.arrival_time, flight_details.flight_date, flight_details.price, flight_details.available_seats\n" +
                    "FROM flight\n" +
                    "INNER JOIN flight_details ON flight.flight_id = flight_details.flight_id;");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("airline_name")+" "+resultSet.getString("from_location")+" "+resultSet.getInt("to_location") +" "+resultSet.getInt("departure_time") +" "+resultSet.getInt("arrival_time") +" "+resultSet.getInt("flight_date") +" "+resultSet.getInt("flight_price") );
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
