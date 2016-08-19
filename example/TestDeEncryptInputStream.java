import java.io.*;

public class TestDeEncryptInputStream {
  public static void main(String[] args) {
    int c;

    try {
      InputStream is = 
        new DeEncryptInputStream(
          new BufferedInputStream(
            new FileInputStream("Simon.txt")));

      while ((c = is.read()) != -1) {
        System.out.print((char)c);
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
