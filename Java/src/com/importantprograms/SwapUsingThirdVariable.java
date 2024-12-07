package com.importantprograms;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int temp = x;
         x = y;
         y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}
