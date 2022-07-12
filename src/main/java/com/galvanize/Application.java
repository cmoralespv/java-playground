package com.galvanize;

public class Application {

    public static void main(String[] args) {

        String[] data = {"Carlos Morales", "cmorpv@gmail.com"};
        System.out.println(emailFormat(data));

        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(2));
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
}
