package com.ljj.jdk.chapter2;

import java.util.ArrayList;
import java.util.List;

public class StringOOMMock {

    static String base = "string";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String str = base + base;
            list.add(str.intern());
        }
    }
}
