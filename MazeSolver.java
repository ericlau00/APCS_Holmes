import java.util.ArrayList;

public class MazeSolver {
    ArrayList<int[]> path;
    Maze maze; 
    
    public MazeSolver(String textMaze) {
        maze = new Maze(textMaze);
    }
    
    public void generatePath(int[] coordinates) {
        if(maze.lastIsNg()) {
        }
        if(maze.accept()) {
            path = maze.getPath();
        }
        else {
            if is the start, check all four
            other wise, find direction coming from and only go the other three 
        }
        
    }
    public toString
}