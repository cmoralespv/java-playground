package com.galvanize;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {

        String[] data = {"Carlos Morales", "cmorpv@gmail.com"};
        System.out.println(emailFormat(data));

        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(2));

        System.out.println(romanToDecimal("MCMXLIV"));
    }

    public static String emailFormat(String[] inputs) {

        if (inputs.length == 0) {
            System.out.println("Please specify a name and email");
            System.exit(1);
        } else if (inputs.length == 1) {
            System.out.println(String.format("Please specify an email for %s", inputs[0]));
            System.exit(1);
        }

        return String.format("%s <%s>", inputs[0], inputs[1]);
    }

    public static String fizzBuzz(int input) {

        String result = "";

        if (input % 3 == 0 && input % 5 == 0) {
            result = "FizzBuzz";
        } else if (input % 3 == 0) {
            result = "Fizz";
        } else if (input % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.format("%s", input);
        }
       return result;
    }

    public static Integer romanToDecimal(String input) {

        Integer decimalValue = 0;

        HashMap<Character, Integer> equivalence = new HashMap<Character, Integer>();

        equivalence.put('I', 1);
        equivalence.put('V', 5);
        equivalence.put('X', 10);
        equivalence.put('L', 50);
        equivalence.put('C', 100);
        equivalence.put('D', 500);
        equivalence.put('M', 1000);

        for (int i = 0; i < input.length() - 1; i++) {

            Integer current = equivalence.get(input.charAt(i));
            Integer next = equivalence.get(input.charAt(i+1));

            if (current < next) {
                decimalValue += next - current;
                if ( i + 1 >= input.length() - 1) {
                    break;
                } else {
                    i++;
                }
            } else {
                decimalValue += current;
            }

        }

        return decimalValue;
    }
}
