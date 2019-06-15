import java.util.ArrayList;

public class MazeSolver {
    ArrayList<ArrayList<int[]>> paths;
    Maze maze; 
    
    public MazeSolver(String textMaze) {
        maze = new Maze(textMaze);
        paths = new ArrayList<>();
        generatePath();
    }
    
    public void generatePath() {
        if(maze.lastIsNg()) {
        }
        else if(maze.accept()) {
            paths.add(maze.copyPath());
        }
        else {
            int[] latest = maze.getLatest();
            int[][] adj={{latest[0], latest[1] - 1},  //left
                         {latest[0], latest[1] + 1},  //right 
                         {latest[0] - 1, latest[1]},  //up
                         {latest[0] + 1, latest[1]}}; //down 
            for(int[] neighbor: adj) {
                maze.populate(neighbor);
                generatePath();
                maze.depopulate();
            }
        }  
    }
    
    public String toString() {
        String string = new String();
        string += maze;
        for(ArrayList<int[]> path: paths) {
            for(int[] coord: path) {
                string += "(" + coord[0] + " " + coord[1] + "),";
            }
            string += System.lineSeparator() + new Maze(path,maze).toString();
        }
        return string;
    }
}