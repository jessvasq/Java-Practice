import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public void usingJavaNio() throws IOException {
        String[] inputFiles = {"resources/file1.txt", "resources/file2.txt"};
        //file contents will be written in this file
        String outputFile = "resources/nioOutput.txt";

        //get channel for destination or outputFiel
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (int i=0; i < inputFiles.length; i++){
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();
            long size = inputChannel.size();
            ByteBuffer buffer = ByteBuffer.allocate((int) size);
            System.out.print((char) buffer.get());
            while (inputChannel.read(buffer) > 0){
                buffer.flip();
                while (buffer.hasRemaining()){
                    targetChannel.write(buffer);
                }
            }
            //fis.close();
        }

    }

}
