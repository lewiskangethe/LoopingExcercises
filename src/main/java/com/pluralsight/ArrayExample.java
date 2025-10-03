package com.pluralsight;

public class ArrayExample {
    public static void main(String[] args) {
        int numbers[] = {55,66,69,23,9,86};

//        int numberA = numbers[3];
//        System.out.println(numberA);
//        System.out.println(numbers[2]);
        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];
            System.out.println(currentNumber);
        }


//        String students[] = {"Lucas", "Marianna", "Martha", "Nam", "Vincent", "Romell"};
//
//        String studentA = students[3];
//        System.out.println(studentA);
//        System.out.println(students[1]);
    }

}
