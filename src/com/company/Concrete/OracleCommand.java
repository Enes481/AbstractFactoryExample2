package com.company.Concrete;

import com.company.Abstract.Command;

public class OracleCommand extends Command {
    @Override
    public void Execute() {
        System.out.println("ORACLE sorgusu çalıştırıldı. Sorgu:"+Query);
    }
}
