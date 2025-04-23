package com.ironhack.w1.d1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // PRIMITIVE DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 9999;
        long myLong = 500000000000L;
        float myFloat = 1.654f;
        double myDouble = 2.65;
        boolean myBoolean = true;
        char myChar = 'a';

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);

        // STRINGS

        String myString = "Hello to everyone";
        System.out.println(myString);

        //OPERATORS

        int number = 10;
        double doubleNumber = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);

        // SYNTAX

        // if-else syntax

        number = 20;

        if (number == 0) {
            System.out.println("Number is equal to 0");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("Number is bigger or equal to 100 and less or equal to 1000");
        } else {
            System.out.println("Number has another value");
        }

        if (number >= 10 || number <= -10) {
            System.out.println("Number has at least two digits");
        }

        boolean myCondition = true;

        if (myCondition) {
            System.out.println("Condition is true");
        } else {System.out.println("Condition is false");
        }

        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

    }

    // FALTA CREAR METHOD Y STRING METHOD

}