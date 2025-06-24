package com.epam.training.student_olha_diatlova.task3;

public class StringAnalyzer {
    public int maxUnequalConsecutiveChars(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }


    public int maxEqualConsecutiveLetters(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        boolean letterFound = false;
        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            char previous = input.charAt(i - 1);

            if (isLatinLetter(current) && current == previous){
                letterFound = true;
                currentLength++;
            } else{
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        if (!letterFound) {
            return 0;
        }

        return Math.max(maxLength, currentLength);
    }

    public int maxEqualConsecutiveDigits(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        boolean digitFound = false;
        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)) && input.charAt(i) == input.charAt(i - 1)) {
                digitFound = true;
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        if (!digitFound) {
            return 0;
        }

        return Math.max(maxLength, currentLength);
    }

    public static boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}

