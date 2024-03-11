package org.example;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Conexion {
    public Connection get_connection () {
        Connection con = null;
         try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "frank","");
             if(con != null) {
                 System.out.println("Conexion exitoxsa");
             }
         }catch (SQLException e) {
             System.out.println(e);
         } ;

         return  con;

    };

}
