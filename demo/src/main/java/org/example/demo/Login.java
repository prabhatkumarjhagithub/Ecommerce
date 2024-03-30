package org.example.demo;

import java.sql.ResultSet;

public class Login {
    public Customer customerlogin(String username, String password) {
        String query = "SELECT * FROM CUSTOMER WHERE email='" + username + "' AND password='" + password + "'";
        Dbconnection connection = new Dbconnection();
        try {
            ResultSet rs = connection.getQueryTable(query);
            if (rs.next())
                return new Customer(rs.getInt("id"),
                        rs.getString("name"), rs.getString("email"), rs.getString("mobile"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;


    }
//    public  static  void  main(String[] args){
//        Login login=new Login();
//        Customer customer=login.customerlogin("prabhat10200@gmail.com","prabhat@123");
//        System.out.println("welcome :" + customer.getName());
//       // System.out.println(login.customerlogin("prabhat10200@gmail.com","prabhat@123"));
//    }
//}
}