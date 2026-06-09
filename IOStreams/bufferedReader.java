package IOStreams;

import java.io.FileReader;
import java.io.BufferedReader;

public class bufferedReader {
    public static void main(String[] args){
        //Buffered reader used with FileReader
        try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Eror occured");
            e.printStackTrace();
        }
    }
}
