import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    Contact contact1 = new Contact("Petya", 79106549876l);
    Contact contact2 = new Contact("Vasya", 79159645232l);
    Contact contact3 = new Contact("Kolya", 79159645231l);
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.addGroup("Work");
//    phoneBook.addGroup("Work");
    phoneBook.addContact("Work", contact1);
    phoneBook.addContact("Work", contact2);
    phoneBook.addContact("Home", contact1);
    phoneBook.addContact("Home", contact3);

//    System.out.println("Номера в записной книжке: " + phoneBook.getGroups());
//    System.out.println();
//    System.out.println("Поиск по группе Work: " + phoneBook.findContactByGroup("Work"));
//    long numberToFind = 79159645231l;
//    System.out.println();
//    System.out.println("Поиск по номеру 79159645231: " + phoneBook.findContactByNumber(numberToFind));

    MissedCalls.addCall(LocalDateTime.of(2022, 05, 15, 12, 15, 33), 79159645231l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 15, 12, 15, 53), 79169645223l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 12, 12, 15, 24), 79106549876l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 10, 12, 15, 05), 79159645231l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 15, 15, 15, 34), 79159645231l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 17, 17, 15, 58), 79154987132l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 20, 11, 15, 21), 79579213546l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 30, 10, 15, 48), 74956548965l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 02, 18, 15, 52), 74995752164l);
    MissedCalls.addCall(LocalDateTime.of(2022, 06, 15, 20, 15, 00), 79159645232l);
    MissedCalls.addCall(LocalDateTime.now(), 79169654687l);

    MissedCalls.getMissedCalls(phoneBook);
  }
}
