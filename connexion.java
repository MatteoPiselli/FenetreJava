
import java.sql.Connection;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class connexion {

    Connection connect;

    public connexion(){
        try { 
            Class.forName("com.mysql.cj.jbdc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:8888/bdd", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connexion échouée" + e);
        }
    }

}