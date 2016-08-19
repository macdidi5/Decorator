public class ChocolateSauce extends Condiment {
  Breakfast breakfast;

  public ChocolateSauce(Breakfast breakfast) {
    this.breakfast = breakfast;
  }

  public String getDescription() {
    return "巧克力醬" + breakfast.getDescription();
  }

  public int price() {
    return 5 + breakfast.price();
  }

  public int cost() {
    return 2 + breakfast.cost();
  }
}
