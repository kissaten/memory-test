import java.io.*;
import java.nio.*;

public class StdLibBufferTest {
  private static Integer SIZE_OF_BUFFER = 42424242;

  public static void main(String[] args) throws Exception {
    Integer sizeOfBuffer = (args.length > 0) ? Integer.valueOf(args[0]) : SIZE_OF_BUFFER;

    ByteBuffer buffer = ByteBuffer.allocateDirect(sizeOfBuffer);
    //ByteBuffer buffer = ByteBuffer.allocate(SIZE_OF_BUFFER);

    while (true) {
      Thread.sleep(2000);
       System.out.println(buffer == null ? "null" : buffer.toString());
      buffer = null;
      //System.gc();
    }
  }
}