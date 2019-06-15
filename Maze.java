/*
    Representation of a maze
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Maze {
    private ArrayList<ArrayList<String>> maze; 
    private int[] start = new int[2];
    private int[] end = new int[2];
    
    public Maze(String file) {
        maze = new ArrayList<ArrayList<String>>();
        File textMaze = new File(file);
        try {
            Scanner sc = new Scanner(textMaze);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                maze.add(makeHorizontal(line));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private ArrayList<String> makeHorizontal(String line) {
        ArrayList<String> horizontal = new ArrayList<String>();
        for(int i = 0; i < line.length(); horizontal.add(line.substring(i,i+1)), i++) { 
            setStartAndEnd(line.substring(i,i+1), "s", start, i);
            setStartAndEnd(line.substring(i,i+1), "e", end, i);
        }
        return horizontal;
    }
    
    private void setStartAndEnd(String symbol, String target,int[] startOrEnd, int x) {
        if(symbol.equals(target)) {
            startOrEnd[0] = x;
            startOrEnd[1] = maze.size();
        }
    }
    
    public String toString() {
        String string = new String();
        for(int h = 0; h < maze.size(); string+= System.lineSeparator(), h++) {
            for(int v = 0; v < maze.get(h).size(); string += maze.get(h).get(v), v++) {}
        }
        return string;
    }
}