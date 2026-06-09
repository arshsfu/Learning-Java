package IOStreams ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// File class usaully used to work with getnames or other info about files, directories
// 2 types of Streams : Byte(for raw binary data) e.g FileInputStream , FileOutputStream and character(for text data) e.g FileReader, FileWriter, BufferedReader, BufferedWriter
public class fileInputStream{
    public static void main(String[] args){
        // using FileInputStream to read file
        // using FileOutputStream to write file
        // Above Inout stream read data byte by byte
        // works with binary data(images, audio ,...)
        // below we will usually copy sample.txt to copied.txt
        // should close both streams after use or use try with resourecs by allocating resources in try() 
        try{
            FileInputStream input = new FileInputStream("sample.txt");
            FileOutputStream output = new FileOutputStream("copied.txt");
            int i ;
            try{
                while((i = input.read()) != -1){ // returns -1 when reached end of file
                output.write((i));
                input.close();
                output.close();
                }
            }catch(IOException e){
                System.out.println("IO error occurred");
            }
            System.out.println("File copied successfully");
            

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}