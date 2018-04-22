package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    public Connection bukaKoneksi(){
        Connection con =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/dbtransaksi","root","");
            System.out.println("koneksi berhasil");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return  null;
        }
        
    }
    
            
}
