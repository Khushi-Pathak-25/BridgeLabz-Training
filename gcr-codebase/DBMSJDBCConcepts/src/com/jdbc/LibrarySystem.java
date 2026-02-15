package com.jdbc;
import java.sql.*;

public class LibrarySystem {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASSWORD = "Khushi@8251082191";

    public static void borrowBook(int studentId, int bookId) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        con.setAutoCommit(false);

        PreparedStatement borrow = con.prepareStatement(
                "INSERT INTO borrow_records(student_id, book_id, issue_date) VALUES(?,?,CURDATE())");
        borrow.setInt(1, studentId);
        borrow.setInt(2, bookId);
        borrow.executeUpdate();

        PreparedStatement update = con.prepareStatement(
                "UPDATE books SET available_copies = available_copies - 1 WHERE book_id=?");
        update.setInt(1, bookId);
        update.executeUpdate();

        con.commit();
        System.out.println("Book Borrowed");
        con.close();
    }

    public static void returnBook(int borrowId, int bookId) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        PreparedStatement fineCalc = con.prepareStatement(
                "SELECT DATEDIFF(CURDATE(), issue_date)*10 AS fine FROM borrow_records WHERE borrow_id=?");
        fineCalc.setInt(1, borrowId);
        ResultSet rs = fineCalc.executeQuery();
        rs.next();
        double fine = rs.getDouble("fine");

        PreparedStatement updateReturn = con.prepareStatement(
                "UPDATE borrow_records SET return_date=CURDATE(), fine=? WHERE borrow_id=?");
        updateReturn.setDouble(1, fine);
        updateReturn.setInt(2, borrowId);
        updateReturn.executeUpdate();

        PreparedStatement updateBook = con.prepareStatement(
                "UPDATE books SET available_copies = available_copies + 1 WHERE book_id=?");
        updateBook.setInt(1, bookId);
        updateBook.executeUpdate();

        System.out.println("Book Returned. Fine: " + fine);
        con.close();
    }
}