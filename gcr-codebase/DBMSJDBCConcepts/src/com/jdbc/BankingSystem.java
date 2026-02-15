package com.jdbc;

import java.sql.*;

public class BankingSystem {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASSWORD = "Khushi@8251082191";

    public static void transfer(int fromId, int toId, double amount) {

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            con.setAutoCommit(false);

            PreparedStatement deduct = con.prepareStatement(
                    "UPDATE account SET balance = balance - ? WHERE account_id=?");
            deduct.setDouble(1, amount);
            deduct.setInt(2, fromId);
            deduct.executeUpdate();

            PreparedStatement add = con.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE account_id=?");
            add.setDouble(1, amount);
            add.setInt(2, toId);
            add.executeUpdate();

            PreparedStatement history = con.prepareStatement(
                    "INSERT INTO transaction_history(from_account,to_account,amount) VALUES(?,?,?)");
            history.setInt(1, fromId);
            history.setInt(2, toId);
            history.setDouble(3, amount);
            history.executeUpdate();

            con.commit();
            System.out.println("Transfer Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}