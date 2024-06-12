import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class CodeIssues {

    public void unusedTempVariable() {
        int temp = 10;
        System.out.println("Hello, World!");

    }

    public void unusedParameter(int param1, int param2) {
        System.out.println("This method has unused parameters.");
    }

    public void emptyIfBlock(int value) {
        if (value > 0) {
        }
    }

    public void emptyLoopAndExtraSemicolon() {
        for (int i = 0; i < 5; i++);
        while (true) {
        }
    }

    public void logExceptionProperly() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void emptyCatchBlock() {
        try {
        } catch (Exception e) {
        }
    }

    public void unnecessaryTrueOrFalseCondition(boolean condition) {
        if (condition) {
            System.out.println("This condition is always true.");
        }

        if (!condition) {
            System.out.println("This condition is always false.");
        }
    }

    public void switchDefaultNotLast(int value) {
        switch (value) {
            default:
                System.out.println("Default case");
                break;
            case 1:
                System.out.println("Case 1");
                break;
        }
    }

    public void stringComparisonWithoutEquals(String str1, String str2) {
        if (str1 == str2) {
            System.out.println("Strings are equal.");
        }
    }

    public void emptyFinallyBlock() {
        try {
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } finally {
        }
    }

    public void emptyTryBlock() {
        try {
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        }
    }

    public void emptyWhileLoop() {
        while (true) {
        }
    }

    public int returnInFinallyBlock() {
        try {
            return 10;
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } finally {
            return 20;
        }
    }

    public void calendarClassUsageRisks() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);
        System.out.println("Formatted date: " + formattedDate);
    }

    public void simpleDateFormatIssues() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String dateString = "2023/06/12";
        try {
            Date date = sdf.parse(dateString);
            System.out.println("Parsed date: " + date);
        } catch (Exception e) {
            System.out.println("Error parsing date.");
        }
    }

    public void incorrectArrayConversion() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        String[] stringArray = (String[]) stringList.toArray();
    }

    public void nullComparisonInEquals(String str) {
        if (str.equals(null)) {
            System.out.println("Strings are equal.");
        }
    }

    public void emptySwitchBlock(int value) {
        switch (value) {

        }
    }

    public void poorlyNamedMethod() {
        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println("Result: " + result);
    }

    public void unsafeSimpleDateFormatUsage() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2023-06-12");
        System.out.println("Parsed date: " + date);
    }
}
