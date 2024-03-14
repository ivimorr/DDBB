import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class index {

    public static void main(String[] args ){
        //variables de conexión a la base de datos
        String url = "jdbc:mysql://127.0.0.1/examen_ev2";
        String username = "root";
        String password = "dbrootpass";

        // Objeto Connection para manejar la conexion
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(url, username, password);

            if(connection != null){
                System.out.println("Connection succesfulled to data base");
                // Aquí pudes realizar operaciones con la base de datos
            }
        }catch(SQLException e){
            System.out.println("Error connecting database");
        }finally{
            //Cerrar la conexion al finalizar 
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException e){
                    System.out.println("Error closing database");
                }
            }
        }

    }
}