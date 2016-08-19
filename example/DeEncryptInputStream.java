import java.io.*;

public class DeEncryptInputStream 
  extends FilterInputStream {
  
  public DeEncryptInputStream(InputStream is) {
    super(is);
  }

  public int read() throws IOException {
    int c = super.read();
    
    if (c != -1) {
      c = c + 15;
    }
    
    return c;
  }

  public int read(byte[] b, int offset, int len) 
    throws IOException {
    
    int read = super.read(b, offset, len);

    for (int c = 0; c < offset + read; c++) {
      b[c] = (byte)(c + 15);
    }
    
    return read;
  }
}
