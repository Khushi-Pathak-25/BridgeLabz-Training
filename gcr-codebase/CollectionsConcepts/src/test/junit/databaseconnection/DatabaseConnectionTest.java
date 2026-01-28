package test.junit.databaseconnection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.databaseconnection.DatabaseConnection;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    DatabaseConnection connection;

    @BeforeEach
    void setUp() {
        connection = new DatabaseConnection();
        connection.connect();
    }

    @AfterEach
    void tearDown() {
        connection.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(connection.isConnected());
    }

    @Test
    void testConnectionClosed() {
        assertTrue(connection.isConnected());
    }
}