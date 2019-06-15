/*
    Representation of a maze
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Maze {
    private ArrayList<ArrayList<String>> maze; 
    private ArrayList<int[]> path;
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
            path = new ArrayList<>();
            path.add(start);
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
            startOrEnd[0] = maze.size();
            startOrEnd[1] = x;
        }
    }
    
    public int[] getStart() {return start;}
    
    public int[] getEnd() {return end;}
    
    public int[] getLatest() {return path.get(path.size() -1);}
    
    public int[] getSecondLatest() {return path.get(path.size() - 2);}
    
    public boolean lastIsNg() {
        int[] coordinates = getLatest();
        if (path.size() < 1) return false; 
        if (maze.get(coordinates[0]).get(coordinates[1]).equals("#")){
            System.out.println("into wall");
            return true;
        }
        for(int i = 0; i < path.size() -1 ; i++) {
            if(coordinates[0]==path.get(i)[0] && coordinates[1] == path.get(i)[1]) {
                System.out.println("not good");
                return true;
            }
        }
        return false; 
    }
    
    public boolean accept() {return getLatest()[0] == end[0] && getLatest()[1] == end[1];}
    
    public void populate(int[] coordinates) {path.add(coordinates);}
    
    public void depopulate() {path.remove(path.size() - 1);}
    
    public String toString() {
        String string = new String();
        for(int h = 0; h < maze.size(); string+= System.lineSeparator(), h++) {
            for(int v = 0; v < maze.get(h).size(); string += maze.get(h).get(v), v++) {}
        }
        return string;
    }
    
    public ArrayList<int[]> copyPath() {
        ArrayList<int[]> copy = new ArrayList<>();
        for(int[] coordinates: path) {
            copy.add(coordinates);
        }
        System.out.println(copy);
        return copy;
    }
    
    
}