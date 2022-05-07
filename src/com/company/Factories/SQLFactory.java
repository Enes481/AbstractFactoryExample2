package com.company.Factories;

import com.company.Abstract.Command;
import com.company.Concrete.SQLCommand;
import com.company.Concrete.SQLConnection;
import com.company.Abstract.Connection;
import com.company.Interface.IDBFactory;

public class SQLFactory implements IDBFactory {

    @Override
    public Connection getConnection() {
        return new SQLConnection();
    }

    @Override
    public Command getCommand() {
        return new SQLCommand();
    }
}
