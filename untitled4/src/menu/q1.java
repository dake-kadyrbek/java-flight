package menu;
import java.net.StandardSocketOptions;
import java.sql.*;
import java.util.Scanner;

public class q1 {
        public static void main(String[] args){

            Starter letsGo = new Starter();
            letsGo.start();
        }

}
































            /*Connection connection = null;
            Statement st = null;
            Statement stmt = null;

            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Schedule", "postgres", "0000");

                st = connection.createStatement();
                //stmt = connection.createStatement();

                //String queryCreate = "CREATE TABLE product_details(product_id int PRIMARY KEY, product_name varchar, price varchar)";
                //String queryCreate = "CREATE TABLE customer_details(order_id int PRIMARY KEY, customer_name varchar, customer_phone varchar)";
                //String queryCreate = "CREATE TABLE order_details(order_id int REFERENCES customer_details(order_id), product_id int REFERENCES product_details(product_id))";
                //String queryInsert = "INSERT INTO customer_details(order_id,customer_name, customer_phone) VALUES ('1','John', '87015754074')";
                //String queryUpdate = "UPDATE customer_details SET customer_name = 'John' where order_id=1";
                //String querySelect = "SELECT*FROM product_details";
                //String queryDelete = "DELETE product_details where product_price<30000";

                //st.executeUpdate(queryInsert);
                //stmt.executeUpdate(queryUpdate);

                //ResultSet rs = stmt.executeQuery(querySelect);

                    //int id  = rs.getInt("order_id");
                    //String name = rs.getString("product_name");
                    //String price = rs.getString("product_price");

                    //Display values System.out.println(" ");
                    //System.out.print(" " + name);
                    //System.out.println(" ");
                    //System.out.print(" " + price);

             */

             /*   //rs.close();
                st.close();
                connection.close();

            } catch (Exception e) {
                System.out.println(e);
            }

             */