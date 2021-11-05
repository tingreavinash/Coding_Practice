package io.github.tingreavinash.java_concepts.JDBC;

import java.sql.*;


public class JDBC_Connection {
    // JDBC Driver name and database URL
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:mem:test";

    // Database credentials
    private static final String USER = "sa";
    private static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            // STEP 1: Register JDBC Driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection to database
            System.out.println("Connecting to database..");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Execute a query
            System.out.println("Creating table in database..");
            createTable(conn);

            System.out.println("Inserting records in table..");
            insertRecords(conn);

            System.out.println("Displaying records: ");
            showRecords(conn);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //STEP 4: finally block used to close resources
            try {
                if (st != null)
                    st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Good Bye !");

    }

    public static void createTable(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "CREATE TABLE   REGISTRATION " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
                + " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";

        st.executeUpdate(sql);

        st.close();
    }

    public static void insertRecords(Connection conn) throws SQLException {
        Statement st = conn.createStatement();

        String sql = "INSERT INTO Registration " + "VALUES (100, 'Avinash', 'Tingre', 24)";
        st.executeUpdate(sql);

        sql = "INSERT INTO Registration " + "VALUES (101, 'Ganesh', 'Ghodake', 26)";
        st.executeUpdate(sql);

        sql = "INSERT INTO Registration " + "VALUES (102, 'Shantanu', 'Dixit', 26)";
        st.executeUpdate(sql);

        sql = "INSERT INTO Registration " + "VALUES(103, 'Gaurav', 'Kadambande', 24)";
        st.executeUpdate(sql);

        st.close();
    }

    public static void showRecords(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "SELECT id, first, last, age FROM Registration";
        ResultSet rs = st.executeQuery(sql);

        // Extract data from result set
        while(rs.next()) {
            // Retrieve by column name
            int id  = rs.getInt("id");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");

            // Display values
            System.out.print("ID: " + id);
            System.out.print(", Age: " + age);
            System.out.print(", First: " + first);
            System.out.println(", Last: " + last);
        }
        // Clean-up environment
        rs.close();

        st.close();
    }

}
