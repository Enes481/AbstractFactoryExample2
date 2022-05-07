package com.company.Factories;

import com.company.Abstract.Command;
import com.company.Concrete.OracleCommand;
import com.company.Concrete.OracleConnection;
import com.company.Abstract.Connection;
import com.company.Interface.IDBFactory;

public class OracleFactory implements IDBFactory {
    @Override
    public Connection getConnection() {
        return new OracleConnection();
    }

    @Override
    public Command getCommand() {
        return new OracleCommand();
    }
}
