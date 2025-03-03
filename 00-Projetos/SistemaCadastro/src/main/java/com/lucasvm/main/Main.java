package com.lucasvm.main;

import com.lucasvm.dao.DatabaseConnectionMySQL;

public class Main {
    public static void main(String[] args) {

        DatabaseConnectionMySQL connection1 = new DatabaseConnectionMySQL("localhost", 3306, "myDB", "root", "123456");

        connection1.connect();

        connection1.inserirUsuario("Lucas", "lucas@email.com", 25);

        connection1.disconnect();
    }
}
