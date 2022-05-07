package com.company.Concrete;

import com.company.Abstract.Connection;

public class OracleConnection extends Connection {
    @Override
    public void Open() {
        System.out.println("Oracle bağlantısı açıldı. Bağlantı: "+ConnectionString);
    }

    @Override
    public void Close() {
        System.out.println("Oracle bağlantısı kapatıldı. Bağlantı: "+ConnectionString);

    }
}
