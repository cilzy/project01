package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWord {
    public static void main(String[] args) {

        //region Description
        System.out.println("helloword!!");
        ArrayList list=new ArrayList();
        Date date = new Date();
        //endregion


    }

    public void method() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("hello.txt");
    }
}
