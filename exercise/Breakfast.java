public abstract class Breakfast {
  protected String description = "Unknown";

  public String getDescription() {
    return description;
  }

  public abstract int price();
}
