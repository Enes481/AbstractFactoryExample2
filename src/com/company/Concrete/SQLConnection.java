package com.company.Concrete;

import com.company.Abstract.Connection;

public class SQLConnection extends Connection {
    @Override
    public void Open() {
        System.out.println("MSSQL bağlantısı açıldı. Bağlantı"+ConnectionString);
    }

    @Override
    public void Close() {
        System.out.println("MSSQL bağlantısı kapandı. Bağlantı"+ConnectionString);

    }
}
