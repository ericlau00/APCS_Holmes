import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] commandLine) {
        File file = new File("maze.txt");
        int verticalLength = 0; 
        int horizontalLength = 0; 
        try {
            Scanner sc = new Scanner(file);
            String line = new String();
            while (sc.hasNextLine()) {
                verticalLength++;
                line = sc.nextLine();
            }
            horizontalLength = line.length();
            
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}