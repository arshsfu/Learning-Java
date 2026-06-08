import java.io.File; //File package used to work with Files
import java.io.FileNotFoundException;
import java.io.IOException; // IOException used for error handling
import java.io.FileWriter; // used for writing in a file
// for writing purpose we can also use java.io.BufferedWriter (for large text files) and .FileOutputStream(for images , audios and pdfs)
import java.util.Scanner; // used to read
//.FileInputStream and .BufferedReader class also used to read contents of the file

public class FileHandling{
    public static void main(String[] args){
        File myobj = new File("sample.txt");
        //creating a file
        try{
            if(myobj.createNewFile()){ // returns true if success else false if already exists
                System.out.println("File is created");
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace(); //printStackTrace gives full error info
        }

        // writing in a file
        try{
            //.write overwrites file content if we just wanna append then use 2 argument constructor of write where second argument is true then write is opened in append mode
            FileWriter myWriter = new FileWriter("sample.txt",true); 
            myWriter.write("This is the line written when write function is called from FileWriter class");
            System.out.println("File is written");
            myWriter.close(); // needs to close FilWriter in previous java versions
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        
        //Reading a file
        try{
            Scanner myReader = new Scanner(myobj);
            while(myReader.hasNextLine()){ //returns true if there is content 
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        //getting fileinfo
        if(myobj.exists()){
            System.out.println(myobj.getName());
            System.out.println(myobj.getAbsolutePath());
            System.out.println(myobj.canRead());
            System.out.println(myobj.canWrite());
            System.out.println(myobj.length());
        }

        //deleting a file
        if(myobj.delete()){
            System.out.println("File is deleted");
        }else{
            System.out.println("File failed to delete");
        }

    }
}