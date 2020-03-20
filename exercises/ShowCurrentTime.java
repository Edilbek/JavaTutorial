public class ShowCurrentTime {
  public static void main(String[] args) {
    // Obtain the total milliseconds since midnigth, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();

    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;

    // Compute the current second int the minute in the hour
    long currentSecond = totalSeconds % 60;

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minutes time in the hour
    long currentMinutes = totalMinutes % 60;

    // Obtain the total hours
    long totalHours = totalMinutes / 60;

    // Compute the current hour
    long currentHour = totalHours % 24;

    System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond + " GMT");
  }
}
