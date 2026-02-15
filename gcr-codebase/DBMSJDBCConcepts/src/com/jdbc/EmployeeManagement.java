package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class EmployeeManagement {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASSWORD = "Khushi@8251082191";

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Search 6.Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: // Add
                    PreparedStatement ps1 = con.prepareStatement(
                            "INSERT INTO employee(name, department, salary) VALUES(?,?,?)");
                    System.out.print("Name: ");
                    ps1.setString(1, sc.next());
                    System.out.print("Dept: ");
                    ps1.setString(2, sc.next());
                    System.out.print("Salary: ");
                    ps1.setDouble(3, sc.nextDouble());
                    ps1.executeUpdate();
                    System.out.println("Employee Added");
                    break;

                case 2: // View
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM employee");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getDouble("salary"));
                    }
                    break;

                case 3: // Update Salary
                    PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE employee SET salary=? WHERE id=?");
                    System.out.print("New Salary: ");
                    ps2.setDouble(1, sc.nextDouble());
                    System.out.print("Employee ID: ");
                    ps2.setInt(2, sc.nextInt());
                    ps2.executeUpdate();
                    System.out.println("Salary Updated");
                    break;

                case 4: // Delete
                    PreparedStatement ps3 = con.prepareStatement(
                            "DELETE FROM employee WHERE id=?");
                    System.out.print("Employee ID: ");
                    ps3.setInt(1, sc.nextInt());
                    ps3.executeUpdate();
                    System.out.println("Deleted");
                    break;

                case 5: // Search
                    PreparedStatement ps4 = con.prepareStatement(
                            "SELECT * FROM employee WHERE name LIKE ?");
                    System.out.print("Name: ");
                    ps4.setString(1, "%" + sc.next() + "%");
                    ResultSet rs2 = ps4.executeQuery();
                    while (rs2.next()) {
                        System.out.println(rs2.getInt("id") + " " +
                                rs2.getString("name") + " " +
                                rs2.getDouble("salary"));
                    }
                    break;

                case 6:
                    con.close();
                    System.exit(0);
            }
        }
    }
}