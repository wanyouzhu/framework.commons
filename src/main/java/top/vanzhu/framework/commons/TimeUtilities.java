package top.vanzhu.framework.commons;

import org.apache.commons.lang3.StringUtils;

import java.time.Instant;

public class TimeUtilities {

    public static String toString(Instant instant) {
        return instant == null ? null : instant.toString();
    }

    public static Instant parseNullableInstant(String input) {
        return StringUtils.isBlank(input) ? null : Instant.parse(input);
    }

}
