public class HandsomeAndHandsome {
  public static void main(String[] args) {
    Breakfast breakfast = new Sandwich();
    breakfast = new Ham(breakfast);
    breakfast = new Egg(breakfast);
    System.out.println(breakfast.getDescription() + 
                       " $" + breakfast.price());
  }
}
