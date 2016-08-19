public class Egg extends Condiment {
  Breakfast breakfast;

  public Egg(Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public String getDescription() {
    return breakfast.getDescription() + "加蛋";
  }

  public int price() {
    return 5 + breakfast.price();
  }
}
