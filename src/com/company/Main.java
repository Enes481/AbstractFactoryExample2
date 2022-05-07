package com.company;

import com.company.Factories.OracleFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DBClient dbClient = new DBClient(new OracleFactory(),"Server=.;Database=myDb;Userid=123");
        dbClient.doJob("SELECT*FROM PRODUCT");
    }
}
