package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,temp=0,count=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number: "); // Enter number upto which you want to find prime number
        n=sc.nextInt();

        for(int i=2;i<=n;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp+=1;

                }
            }if(temp==0){
                System.out.print(i+"  ");
            }else {
                temp=0;
            }

        }


    }
}
