package com.example.app;

/**
 * Database configuration class
 */
public class DatabaseConfig {
    
    private static final String DB_PASSWORD = "SuperSecret123!";
    private static final String DB_USER = "admin";
    private static final String DB_HOST = "production-db.example.com";
    
    public String getConnectionString() {
        return String.format("jdbc:postgresql://%s:5432/mydb?user=%s&password=%s",
                DB_HOST, DB_USER, DB_PASSWORD);
    }
    
    public static String getApiKey() {
        return "sk-1234567890abcdefghijklmnopqrstuvwxyz";
    }
}
