package com.transaction;

public class MyTransaction {

    public void begin(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }

}
