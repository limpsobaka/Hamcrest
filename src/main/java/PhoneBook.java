import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
  protected Map<String, List<Contact>> groups = new HashMap<>();

  public void addGroup(String groupName) {
    if (groups.containsKey(groupName)) {
      System.out.println("Такая группа уже есть, введите другое имя группы.");
    } else {
      groups.put(groupName, new ArrayList<>());
    }
  }

  public void addContact(String groupName, Contact contact) {
    if (!groups.containsKey(groupName)) {
      addGroup(groupName);
    }
    groups.get(groupName).add(contact);
  }

  public List<Contact> findContactByGroup(String groupName) {
    return groups.get(groupName);
  }

  public String findContactByNumber(Long phoneNumber) {
    String result = null;
    for (List<Contact> contacts : groups.values()) {
      for (Contact contact : contacts) {
        if (contact.getNumber().equals(phoneNumber)) {
          result = contact.getName();
          break;
        }
      }
    }
    return result;
  }

  public Map<String, List<Contact>> getGroups() {
    return groups;
  }
}
