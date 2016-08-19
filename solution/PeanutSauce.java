public class PeanutSauce extends Condiment {
  Breakfast breakfast;

  public PeanutSauce(Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public String getDescription() {
    return "花生醬" + breakfast.getDescription();
  }

  public int price() {
    return 5 + breakfast.price();
  }

  public int cost() {
    return 2 + breakfast.cost();
  }
}
