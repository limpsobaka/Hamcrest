import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PhoneBookTest {
  Contact contact;
  PhoneBook phoneBook;

  @BeforeEach
  public void initEachTest() {
    contact = new Contact("Petya", 79106549876l);
    phoneBook = new PhoneBook();
  }

  @Test
  public void testAddGroup() {
    //assert
    String expected = "Work";

    //act
    phoneBook.addGroup("Work");
    Map<String, List<Contact>> result = phoneBook.groups;

    //assert
    assertThat(result, hasKey(expected));
  }

  @Test
  public void testAddContact() {
    //assert
    List<Contact> expected = new ArrayList<>();
    expected.add(contact);

    phoneBook.addGroup("Work");

    //act
    phoneBook.addContact("Work", contact);
    Map<String, List<Contact>> result = phoneBook.groups;

    //assert
    assertThat(result, hasValue(expected));
  }

  @Test
  public void testFindContactByGroup() {
    //assert
    Contact expected = contact;
    phoneBook.addGroup("Work");
    phoneBook.addContact("Work", contact);

    //act
    List<Contact> result = phoneBook.findContactByGroup("Work");

    //assert
    assertThat(result, hasItems(expected));
  }

  @Test
  public void testFindContactByNumber() {
    //assert
    Class expected = String.class;

    phoneBook.addGroup("Work");
    phoneBook.addContact("Work", contact);

    //act
    String result = phoneBook.findContactByNumber(79106549876l);

    //assert
    assertThat(result, any(expected));
  }

  @Test
  public void testGetGroups() {
    //assert
    phoneBook.addGroup("Work");
    phoneBook.addContact("Work", contact);

    //act
    Map<String, List<Contact>> result = phoneBook.getGroups();

    //assert
    assertThat(result, anything());
  }
}