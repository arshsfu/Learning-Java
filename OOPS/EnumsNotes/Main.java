package OOPS.EnumsNotes;

enum Level{
    LOW, 
    MEDIUM,
    HIGH
}

public class Main {
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        for(Level item : Level.values()){
            System.out.println(item);
        }
    }
}
