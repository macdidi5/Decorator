public class Ham extends Condiment {
  Breakfast breakfast;

  public Ham(Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public String getDescription() {
    return "火腿" + breakfast.getDescription();
  }

  public int price() {
    return 8 + breakfast.price();
  }
}
