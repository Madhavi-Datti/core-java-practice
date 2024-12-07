package com.basicprograms;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        callByValue(a);
         System.out.println(a);
    }
    public  static void callByValue(int a) {
        a = a+1;
        System.out.println(a);
}}