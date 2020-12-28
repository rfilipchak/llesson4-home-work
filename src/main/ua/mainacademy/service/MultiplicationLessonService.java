package main.ua.mainacademy.service;

import java.util.logging.Logger;

public class MultiplicationLessonService {

    private static Logger LOGGER = Logger.getLogger(MultiplicationLessonService.class.getName());

    private static final String space = " ";
    private static final String dividedLine = "-";
    private static final String enter = "\n";

    public static String getMultiplicationLessonForNumbers(int number, int multiplier) {
        StringBuffer sb = new StringBuffer();
        int positiveNumber = Math.abs(number);
        int positiveMultiplier = Math.abs(multiplier);
        int result = positiveNumber * positiveMultiplier;

        String multiplicationLesson = sb.append(getBuiltSpaces(positiveNumber, result).append(positiveNumber))
                .append(enter)
                .append(getBuiltSpaces(positiveMultiplier, result).append(positiveMultiplier)).append(enter)
                .append(getBuiltSpaces(positiveMultiplier, result).append(divider(positiveMultiplier)))
                .append(enter)
                .append(multiplicationSteps(positiveNumber, positiveMultiplier, result))
                .append(divider(result))
                .append(enter)
                .append(result)
                .toString();

        if ( number < 0 || multiplier < 0 ) {
            LOGGER.info(String.format("Get start with multiplication of prime numbers: %s and %s  result is: \n%s \nNegative value.", number, multiplier,
                    multiplicationLesson));
        } else {
            LOGGER.info(String.format("Get start with multiplication of prime numbers: %s and %s  result is: \n%s", number, multiplier,
                    multiplicationLesson));
        }
        return multiplicationLesson;
    }

    private static String divider(int value) {
        StringBuilder result = new StringBuilder();
        int lengthValue = String.valueOf(value).toCharArray().length;
        result.append(dividedLine.repeat(lengthValue));
        return result.toString();
    }

    private static String multiplicationSteps(int number, int multiplier, int result) {
        StringBuilder steps = new StringBuilder();
        StringBuilder startString = getBuiltSpaces(number, result);
        char[] multipliers = String.valueOf(multiplier).toCharArray();
        for (int i =multipliers.length-1; i>=0 ; i--) {
            int value = number * Character.getNumericValue(multipliers[i]);
            steps.append(startString.toString());
            steps.append(value);
            steps.append(enter);
            if (startString.length() - 1 >= 0) startString.deleteCharAt(startString.length() - 1);
        }
        return steps.toString();
    }

    private static StringBuilder getBuiltSpaces(int a, int b) {
        StringBuilder spaces = new StringBuilder();
        int spacesAmount = String.valueOf(b).toCharArray().length - String.valueOf(a).toCharArray().length;
        spaces.append(space.repeat(Math.max(0, spacesAmount)));
        return spaces;
    }
}
