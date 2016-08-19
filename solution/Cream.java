public class Cream extends Condiment {
  Breakfast breakfast;

  public Cream(Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public String getDescription() {
    return "奶油" + breakfast.getDescription();
  }

  public int price() {
    return 5 + breakfast.price();
  }

  public int cost() {
    return 3 + breakfast.cost();
  }
}
