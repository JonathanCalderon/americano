
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhony
 */
public class conectate {
    
    static String login="root";
    static String password="admin";
    static String url="jdbc:mysql://localhost:3307/americano";
    Connection con=null;
    String driver="com.mysql.jdbc.Driver";

    public conectate() {
        
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, login, password);
            if(con!=null){
               JOptionPane.showMessageDialog(null,"CONEXION EXITOSA"); 
            }
    }catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e);
    }
    }
    
    public Connection getConnection(){
           return con;
    }
    
    public void desconectar(){
        con=null;
        if(con!=null){
               JOptionPane.showMessageDialog(null,"NO ES POSIBLE CERRAR CONEXION"); 
            }
    }
}