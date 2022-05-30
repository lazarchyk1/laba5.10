package com.company;

public class fifth {
    public static void main(String[] args) {
        int summ = 0;
        for(int n = 0; n < 3; n++){
            for(int m = 0; m < 10; m++){
                for(int h = 0; h < 6; h++) {
                    for(int j = 0; j < 10; j++){
                        if(n==2 && m > 3){
                            continue;
                        }
                        if((n==h && m==j)||(n==j && m==h)){
                            summ += 1;
                        }
                    }
                }
            }
        }
        System.out.println("кількості співпадінь симетричних комбінацій цифр на електронному годиннику = "+ summ);
    }
}