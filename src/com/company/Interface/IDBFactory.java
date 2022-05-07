package com.company.Interface;

import com.company.Abstract.Command;
import com.company.Abstract.Connection;

public interface IDBFactory {
    Connection getConnection();
    Command getCommand();
}
