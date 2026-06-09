package IOStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
    public static void main(String[] args){
        // using bufferedWriter always used with FileWriter
        // true as 2nd argument to append
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt", true))){
            bw.write("first Line");
            bw.newLine(); // to go to new line means adds line break
            bw.write("third line");
            System.out.println("File written succesfully");
        }catch(IOException e){
            System.out.println("IO error occured");
            e.printStackTrace();
        }
    }
}
