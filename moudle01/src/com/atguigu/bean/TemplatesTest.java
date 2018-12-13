package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author cilzy
 * @date 2018/12/13 -19:21
 */
public class TemplatesTest {

    private static final int NUM = 0;
    public static final int I=2;
    public static final int M=2;
    public static final String NAME="lili";

//    模版一
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num=1;
        System.out.println("num = " + num);
        int num2=20;
        System.out.println("args = " + args);
        System.out.println("num = " + num);
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println(num);
        System.out.println(num2);

        String[] arr=new String[]{"Tom","cherry","jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(23);
        list.add(13);
        list.add(223);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(23);
        list.add(13);
        list.add(223);

        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }

    }


}
