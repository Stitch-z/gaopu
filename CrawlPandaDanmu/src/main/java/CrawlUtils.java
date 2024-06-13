import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.logging.Logger;

public class CrawlUtils {


    private static final Logger logger = LoggerFactory.getLogger(CrawlUtils.class);

    public boolean unnecessaryTrueOrFalseCondition(int value) {
        if (value > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareStringsWithoutEquals(String str1, String str2) {
        return str1 == str2;
    }

    public void logExceptionIncorrectly() {
        try {
        } catch (RuntimeException e) {
            logger.error("Exception occurred", e);
        } finally {
        }
    }

    public void unnecessaryNullCheck(String str) {
        if (str != null) {
            System.out.println(str.length());
        }
    }

    public int finallyWithReturn() {
        try {
            return 42;
        } finally {
            return 0;
        }
    }

}
