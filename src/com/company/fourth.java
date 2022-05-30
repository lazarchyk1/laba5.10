package com.company;

public class fourth {
    public static void main(String[] args) {
        int numw = 10;
        int facw = 1;

        int numf = 10;
        int facf = 1;

        while(numw > 1){
            facw *= numw;
            numw--;
        }
        System.out.println(facw + " - while");

        for(int i = 1; i <= numf; i++) {
            facf *= i;
        }
        System.out.println(facf + " - for");
    }
}