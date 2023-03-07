import java.io.FileReader;
import java.io.IOException;

public class FileManagement3 {
  FileReader reader = null;

  public void openFile() throws IOException {
    reader = new FileReader("somefile.txt");
    int i = 0;
    while (i != -1) {
      i = reader.read();
      System.out.print((char) i);
    }
  }
}

/*****************************/
class ThrowsDemo3 {
  public static void main(String[] args) {
    FileManagement3 fm = new FileManagement3();
    try {
      fm.openFile();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}