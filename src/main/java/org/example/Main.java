package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String list = word.nextLine();
        String[] list_1 = list.split(" ");
        String temp = "";
        for (int i = list_1.length - 1; i >= 0; i--) {
            temp += list_1[i] + " ";
        }
        temp = temp.trim();
        System.out.println(temp.replaceAll("[\\s]{2,}", " "));
        }

}