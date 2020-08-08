package com.zzm.interview.base;

public class RefTest {

    public static void changeString(String a)
    {
        a = "2";

    }

    public static void main(String[] args) {
        String b = "1";
        changeString(b);
        System.out.println(b);
        b = "2";
        System.out.println(b);
    }
}
