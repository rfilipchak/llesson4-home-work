package main.ua.mainacademy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ResearchPalindromeService {

    private static Logger LOGGER = Logger.getLogger(ResearchPalindromeService.class.getName());

    public static int getPolindromeMaxValue(int fromValue, int toValue) {
        if (fromValue >= toValue) {
            LOGGER.warning(String.format("Incorrect values from value %s more or equal then to value %s", fromValue, toValue));
            return -1;
        }
        List<Integer> polindroms = new ArrayList<>();
        int polindromMaxValue = 0;
        for (int i = fromValue; i < toValue; i++)
            for (int j = toValue; j > i + 1; j = j - 1) {
                int polindrom = i * j;
                if (polindromValidation(polindrom)) {
                    if (polindromMaxValue < polindrom) {
                        polindromMaxValue = polindrom;
                    }
                    polindroms.add(polindrom);
                }
            }
        LOGGER.info(String.format("Find %s polindromes max value is %s", (polindroms.size()), polindromMaxValue));
        return polindromMaxValue;
    }

    private static boolean polindromValidation(int p) {
        String reverse = "";
        String original = String.valueOf(p);

        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        return original.equals(reverse);
    }
}
