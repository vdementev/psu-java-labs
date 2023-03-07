import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManagement4 {
  FileReader reader = null;

  public void openFile() throws IOException {
    reader = new FileReader("somefile.txt");
    int i = 0;
    while (i != -1) {
      i = reader.read();
      System.out.print((char) i);
    }
  }

  public void readOneByte() throws FileNotFoundException, IOException {
    System.out.println("Do something in readOneByte() method. ");
  }
}

/*****************************/
class ThrowsDemo4 {
  public static void main(String[] args) {
    FileManagement4 fm = new FileManagement4();
    try {
      fm.readOneByte();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}