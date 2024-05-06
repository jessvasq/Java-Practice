import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {
    public void useNio() throws IOException {
        String[] inputFiles = {"resources/file1.txt", "resources/file2.txt"};

        String outputFile = "resources/outputExampleTwo.txt";
        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //transferTo() and transferFrom() methods allow us to cross-connect one channel to another eliminating the need to pass the data through an intermediate buffer
            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }
        //finally close the target channel
        targetChannel.close();
        fos.close();
    }
}
