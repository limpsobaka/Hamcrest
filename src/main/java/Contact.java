public class Contact {

  protected String name;
  protected Long phoneNumber;

  public Contact(String name, Long phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return name + " - " + phoneNumber;
  }

  public Long getNumber() {
    return phoneNumber;
  }

  public String getName() {
    return name;
  }
}