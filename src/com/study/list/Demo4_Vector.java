package com.study.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo4_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");

        //枚举遍历
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
