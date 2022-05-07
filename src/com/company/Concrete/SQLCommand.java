package com.company.Concrete;

import com.company.Abstract.Command;

public class SQLCommand extends Command {
    @Override
    public void Execute() {
        System.out.println("MSSQL sorgusu çalıştırıldı. Sorgu :"+Query);
    }
}
