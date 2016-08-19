public class Corn extends Condiment {
  Breakfast breakfast;

  public Corn(Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public String getDescription() {
    return "玉米" + breakfast.getDescription();
  }

  public int price() {
    return 5 + breakfast.price();
  }
}
