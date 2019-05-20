
package application.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MysqlConnection {
    
    /** * param�tres de connexion:  URL de connection et login, pass pour la BDD */
//    private static String url = "jdbc:mysql://localhost/librairie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//    private static String user = "root";
//    private static String passwd = "ludovic";
    /** * Objet Connection */
    private static Connection connect;
    /** * M�thode qui va nous retourner notre instance * et la cr�er si elle     n'existe pas... * @return */
    public static Connection getInstance(){
        if(connect == null){
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost/librairie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","ludovic");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        }
        return connect;
    }
}