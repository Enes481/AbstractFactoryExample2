package com.company;

import com.company.Abstract.Command;
import com.company.Abstract.Connection;
import com.company.Interface.IDBFactory;

class DBClient {

    Connection _connection;
    Command _command;
    IDBFactory idbFactory;

    public DBClient(IDBFactory idbFactory,String ConnectionString)
    {
        this.idbFactory = idbFactory;
        _connection = idbFactory.getConnection();
        _connection.ConnectionString = ConnectionString;
        _command = idbFactory.getCommand();
    }

    public void doJob(String Query)
    {
        _command.Query = Query;
        _connection.Open();
        _command.Execute();
        _connection.Close();
    }
}
