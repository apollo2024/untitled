package org.example;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int counter = 0;
        while (true){
            int b = num.nextInt();

            if (b == 0){
                break;
            }
            else{
                if (a > 0 && b < 0){
                    counter=counter + a;
                }
            }
            a = b;
        }
        System.out.println(counter);
    }
}
