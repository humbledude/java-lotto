package humbledude.stringaddcalculator;

public class StringAddCalculator {

    private static final String DEAFAULT_SPLIT_TOKEN = ",;";

    public static int splitAndSum(String input) {
        int sum = 0;
        if (!isValidInput(input)) {
            return sum;
        }

        String[] strNumbers = input.split(DEAFAULT_SPLIT_TOKEN);

        for (String strNumber : strNumbers) {
            sum += Integer.parseInt(strNumber);
        }

        return sum;
    }

    private static boolean isValidInput(String input) {
        if (input == null) {
            return false;
        }
        if (input.isEmpty()) {
            return false;
        }

        return true;
    }
}
