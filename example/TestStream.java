import java.io.*;

public class TestStream {
  public static void main(String[] args) {
    try {
      Reader reader = 
        new BufferedReader(
        new InputStreamReader(
        new FileInputStream("Decorator.txt")));
     
      int c;

      while ((c = reader.read()) != -1) {
        System.out.print((char)c);
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
