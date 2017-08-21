package com.company;

public class Prime {

    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            boolean stigma=true;
            for(int j=2;j<=i-1;j++){
                if(i%j==0) {
                    stigma = false;
                    break;
                }
            }

            if (stigma==true){
                System.out.println(i);
            }
        }
    }
}
