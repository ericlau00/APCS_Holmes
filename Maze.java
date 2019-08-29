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
    private int[] start;
    private int[] end;
    
    public Maze(String file) {
        maze = new ArrayList<>();
        File textMaze = new File(file);
        try {
            Scanner sc = new Scanner(textMaze);
            for(String line; sc.hasNextLine(); line = sc.nextLine(), maze.add(makeHorizontal(line))) {}
            path = new ArrayList<>();
            path.add(start);
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private ArrayList<String> makeHorizontal(String line) { //split each character in the horizontal line 
        ArrayList<String> horizontal = new ArrayList<String>();
        for(int i = 0; i < line.length(); horizontal.add(line.substring(i,i+1)), i++) { 
            setEndPoints(line, i, "s", start);
            setEndPoints(line, i, "e", end);
        }
        return horizontal;
    }
    
    private void setEndPoints(String line, int x, String symbol, int[] target) { //sets the position of the start and end points
        if(line.substring(x,x+1).equals(symbol)) target = new int[]{maze.size(), x};
    }
    
    public Maze(ArrayList<int[]> imprint, Maze original) { //imprints the path of the solution onto the maze 
        maze = new ArrayList<>();
        for(int h = 0; h < original.maze.size(); h++) {
            maze.add(new ArrayList<String>());
            for(int v = 0; v < original.maze.get(h).size(); v++) {
                maze.get(h).add(original.maze.get(h).get(v));
                for(int i = 0; i < imprint.size(); i++) {
                    if(imprint.get(i)[0] == h && imprint.get(i)[1] == v) 
                        maze.get(h).set(v,"P");
                }
            }
        }
    }
    
    public int[] getStart() {return start;}
        
    public int[] getLatest() {return path.get(path.size() -1);}
        
    public boolean lastIsNg() {
        int[] coordinates = getLatest();
        if (path.size() < 1) return false; 
        if (maze.get(coordinates[0]).get(coordinates[1]).equals("#")) return true; //if inside a wall
        for(int i = 0; i < path.size() -1 ; i++) {
            if(coordinates[0]==path.get(i)[0] && coordinates[1] == path.get(i)[1]) return true; //if on a tile that was already in the path 
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
        for(int[] coordinates: path) {copy.add(coordinates);}
        return copy;
    }    
    
}