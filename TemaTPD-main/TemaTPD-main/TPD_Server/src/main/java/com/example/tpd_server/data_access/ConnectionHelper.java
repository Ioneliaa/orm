package com.example.tpd_server.data_access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionHelper {
    private static final String url = "jdbc:postgresql://34.116.161.183:5432/postgres?socketFactory=com.google.cloud.sql.postgres.SocketFactory&cloudSqlInstance=esoteric-pen-390014:europe-central2:postgres&user=postgres&password=postgres";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(ConnectionHelper.url);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

