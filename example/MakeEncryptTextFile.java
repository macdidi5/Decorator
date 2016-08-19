import java.io.*;

public class MakeEncryptTextFile {
  public static void main(String[] args) {
    String s = "I am Simon Johnson, IT manager of Handsome & Handsome.";

    try {
      OutputStream os = new FileOutputStream("Simon.txt");

      for (int c = 0; c < s.length(); c++) {
        os.write(s.charAt(c) - 15);
      }

      os.flush();
      os.close();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
