package com.company;

public class third {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 1;

        while(n2 < 11){
            if(n1 % n2 == 0){
                System.out.print(n2 + " ");
            }
            n2++;
        }
    }
}
