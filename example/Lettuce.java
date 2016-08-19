public class Lettuce extends Condiment {
  Breakfast breakfast;

  public Lettuce(Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public String getDescription() {
    return "生菜" + breakfast.getDescription();
  }

  public int price() {
    return 10 + breakfast.price();
  }
}
