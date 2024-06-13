package main.java;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CodeCheck {

    static {

    }

    public void useCalendarIncorrectly() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 32);
        System.out.println(calendar.getTime());
    }

    public void convertListToArray() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        String[] stringArray = stringList.toArray(new Integer[0]);
    }

    public boolean compareWithNull(String str) {
        return str.equals(null);
    }

    public void emptySwitch(int value) {
        switch (value) {
        }
    }

    public boolean complexLogic(int a, int b) {
        if (a > b) {
            return true;
        } else if (a < b) {
            return false;
        } else {
            return a == b;
        }
    }

    public void extraSemicolon() {
        int z = 0;;
    }

    public String formatDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.format(dateFormat.parse(dateString));
        } catch (Exception e) {
            return "";
        }
    }

}
