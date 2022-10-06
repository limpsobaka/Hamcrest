import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

  protected static Map<LocalDateTime, Long> missedCalls = new TreeMap<>();

  public static void getMissedCalls(PhoneBook phoneBook) {

    for (Map.Entry<LocalDateTime, Long> pair : missedCalls.entrySet()) {
      DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
      String date = dateFormat.format(pair.getKey());
      Long call = pair.getValue();

      String name = phoneBook.findContactByNumber(call);
      if (name == null) {
        name = "" + call;
      }

      System.out.println(date + " - " + name);
    }
  }

  public static void addCall(LocalDateTime time, Long number) {
    missedCalls.put(time, number);
  }
}

