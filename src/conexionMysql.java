
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ING.RAFAEL
 */
public class conexionMysql {
    
    Connection conn = null;
    
    public Connection conectar() 
    {
        try 
        {
            String dbName = "mayasorting";
            String dbUserName = "user_mayasorting";
            String dbPassword = "123456789";
            String connectionString = "jdbc:mysql://irm.ddns.me:3306/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionString);

            if (conn != null) {
                System.out.println("Conexión a base de datos listo...");
            } else if (conn == null) {
                throw new SQLException();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error numero 1: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error numero 2: " + e.getMessage());
        } finally {
            return conn;
        }
    }
    public void desconectar() {
        conn = null;
        System.out.println("Desconexion a base de datos listo...");
    }
}
