public class TimestampUtil {
    private static final double MILLISECONDS_PER_HOUR = 3_600_000.0;

    private TimestampUtil() {

    }

    public static long getMilliSecondsBetween(Instant before, Instant after) {
        return ChronoUnit.MILLIS.between(before, after);
    }


    public static long getSecondsBetween(Instant past, Instant present) {
        return Duration.between(past, present).getSeconds();
    }


    public static boolean isBefore(Instant timestamp, Duration duration) {
        return Duration.between(timestamp, Instant.now()).compareTo(duration) > 0;
    }
    public static double getHoursBetween(Instant start, Instant end) {
        double milliseconds = Duration.between(start, end).toMillis();
        return milliseconds/MILLISECONDS_PER_HOUR;
    }
}
