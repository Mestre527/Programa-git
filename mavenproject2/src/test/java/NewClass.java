import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewClass { // Clase principal

    public static void main(String[] args) {
        // URL para conectarse a la base de datos MySQL
        String url = "jdbc:mysql://localhost:3306/fabian11"; // Cambia "tu_base_de_datos" por el nombre de tu base de datos
        String user = "nuevo_usuario"; // Usuario con permisos en la base de datos
        String password = "sena1234"; // Contraseña para el usuario

        // Conexión a la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}


