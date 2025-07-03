import java.sql.*;

public class EmployeeApp {
    static final String DB_URL = "jdbc:mysql://localhost:3306/employee_db";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "yourpassword"; 

    public static void main(String[] args) {
        try (
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)
        ) {
            System.out.println("Connected to the database!");

            addEmployee(conn, "John Doe", "Developer", 75000);

            viewEmployees(conn);

            updateEmployee(conn, 1, "Senior Developer", 90000);

            deleteEmployee(conn, 1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmployee(Connection conn, String name, String role, double salary) throws SQLException {
        String sql = "INSERT INTO employees (name, role, salary) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, role);
            stmt.setDouble(3, salary);
            stmt.executeUpdate();
            System.out.println("Added employee: " + name);
        }
    }

    static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employees";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s, Role: %s, Salary: %.2f%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getDouble("salary"));
            }
        }
    }

    static void updateEmployee(Connection conn, int id, String newRole, double newSalary) throws SQLException {
        String sql = "UPDATE employees SET role = ?, salary = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newRole);
            stmt.setDouble(2, newSalary);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Updated employee with ID: " + id);
            }
        }
    }

    static void deleteEmployee(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Deleted employee with ID: " + id);
            }
        }
    }
}
