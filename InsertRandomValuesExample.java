import java.sql.*;

public class InsertRandomValuesExample {
    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/employees";
            String username = "root";
            String password = "Shubham@123";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Generate and execute INSERT statements
            String insertQuery = "INSERT INTO employees (id, name, age, department, salary) " +
                    "VALUES (?, ?, ?, ?, ?)";

            // Generate random values and insert multiple records
            int numRecords = 10; // Number of records to insert

            for (int i = 1; i <= numRecords; i++) {
                // Generate random values for each record
                int id = i;
                String name = generateRandomName();
                int age = generateRandomAge();
                String department = generateRandomDepartment();
                double salary = generateRandomSalary();

                // Prepare the INSERT statement
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setInt(3, age);
                preparedStatement.setString(4, department);
                preparedStatement.setDouble(5, salary);

                // Execute the INSERT statement
                preparedStatement.executeUpdate();

                // Close the PreparedStatement
                preparedStatement.close();
            }

            // Close the resources
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper methods to generate random values
    private static String generateRandomName() {
        // Implement your logic to generate a random name
        return "John Doe";
    }

    private static int generateRandomAge() {
        // Implement your logic to generate a random age
        return 30;
    }

    private static String generateRandomDepartment() {
        // Implement your logic to generate a random department
        return "Sales";
    }

    private static double generateRandomSalary() {
        // Implement your logic to generate a random salary
        return 50000.0;
    }
}
