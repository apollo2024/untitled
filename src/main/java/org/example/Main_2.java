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
                if (b > 0 && a < 0){
                    counter++;
                }
            }
            a = b;
        }
        System.out.println(counter);
    }
}
