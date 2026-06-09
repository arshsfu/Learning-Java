package IOStreams;

import java.io.FileOutputStream;

public class fileOutputStream{
    public static void main(String[] args){
        String result = "Hello World";
        // using FileOutputStream can handle any type not just .txt files
        // it overwrites the file to append pass second argument as true
        try(FileOutputStream output = new FileOutputStream("output.txt", true)){ // here using try with resources so that we dont have to close the stream manually it does it automatically
            output.write(result.getBytes());
            System.out.println("File written successfully");
        }catch(Exception e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
