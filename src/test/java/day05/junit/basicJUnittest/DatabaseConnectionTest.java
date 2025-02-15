package day05.junit.basicJUnittest;

import org.day05.problemstatement.junit.basicJUnittest.testingannotations.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }
    @Test
    void testConnectionIsEstablished() {
        assertTrue(db.isConnected(), "Connection should be established.");
    }
    @Test
    void testConnectionIsEstablished2() {
        assertTrue(db.isConnected(), "Connection should be established.");
    } @Test
    void testConnectionIsEstablished3() {
        assertTrue(db.isConnected(), "Connection should be established.");
    }
    @AfterEach
    void tearDown() {
        db.disConnect();;
    }
}
