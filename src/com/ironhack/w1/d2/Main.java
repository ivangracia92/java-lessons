package com.ironhack.w1.d2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Week 1 day 2 lessons");

//          ARRAYS

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));
        System.out.println(days[0]);
        System.out.println(days[6]);
        System.out.println(days.length);
        System.out.println(days[days.length - 1]);

        String[] subjectArray = createSubjectArray();
        System.out.println(Arrays.toString(subjectArray));

//          LOOPS
//          FOR LOOP

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < subjectArray.length; i++) {
            System.out.println(i + ": " + subjectArray[i]);
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(evenNumbers));

//          FOREACH LOOP

        for (String subject : subjectArray) {
            System.out.println(subject);
        }

//          WHILE LOOP

        int counter = 0;
        while (counter < 10) {
            System.out.println("Counter: " + counter);
            counter++;
        }

//          DO WHILE LOOP

        counter = 1000;

        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter < 110);

//          ARRAY LIST

        List<String> countries = new ArrayList<>();
        countries.add("Spain");
        countries.add("Argentina");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(0));
        System.out.println(countries.get(2));
        countries.set(2, "Italy");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove(2);
        System.out.println(countries);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

//          ADD ELEMENTS TO ARRAY

        int[] numbers = {0, 1, 2, 3, 4};
        int[] newNumbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }

        newNumbers[5] = 5;

//            MATH CLASS & CASTING

        System.out.println(Math.sqrt(64));
        System.out.println((int)Math.pow(2, 5));
        System.out.println((int)3.75);
        System.out.println((int)Math.ceil(3.75));



    }


    public static String[] createSubjectArray() {
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;
    }
}
