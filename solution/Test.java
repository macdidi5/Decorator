public class Test {
  public static void main(String[] args) {
    Breakfast muffin = new Muffin();
    muffin = new Lettuce(muffin);
    muffin = new Ham(muffin);
    muffin = new Cream(muffin);
    muffin = new ChocolateSauce(muffin);

    System.out.println(muffin.getDescription());
    System.out.println("Price: $" + muffin.price());
    System.out.println("Cost: $" + muffin.cost());
  }
}
