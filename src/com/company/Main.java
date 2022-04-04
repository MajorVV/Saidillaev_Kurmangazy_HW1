package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String myName;
        final int NUM = 0;
        String word = "hey gays";
        myName = NUM + word;
        System.out.println(myName);
        if (NUM < 0)
        {
            System.out.println("You save - ");
        }else if(NUM > 0){
            System.out.println("you save +");
        } else{
            System.out.println("You save zero");

        }
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваше имя ");
        String name = input.nextLine();
        System.out.println("Привет " + name);

    }
}
