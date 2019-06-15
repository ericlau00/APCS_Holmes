import java.util.ArrayList;

public class MazeSolver {
    ArrayList<ArrayList<int[]>> paths;
    Maze maze; 
    
    public MazeSolver(String textMaze) {
        maze = new Maze(textMaze);
        paths = new ArrayList<>();
        System.out.println(maze.getStart()[0] + " " + maze.getStart()[1]);
        System.out.println(maze.getEnd()[0] + " " + maze.getEnd()[1]);

        generatePath();
    }
    
    public void generatePath() {
        if(maze.lastIsNg()) {
            System.out.println("base0");
        }
        else if(maze.accept()) {
            paths.add(maze.copyPath());
            System.out.println("base1");
        }
        else {
            System.out.println("recurse");
            int[] latest = maze.getLatest();
            int[][] adj={{latest[0], latest[1] - 1},  //left
                         {latest[0], latest[1] + 1},  //right 
                         {latest[0] - 1, latest[1]},  //up
                         {latest[0] + 1, latest[1]}}; //down 
            for(int[] neighbor: adj) {
                System.out.println(neighbor[0] + " " + neighbor[1]);
                maze.populate(neighbor);
                generatePath();
                maze.depopulate();
            }
        }  
    }
    
    public String toString() {
        String string = new String();
        for(ArrayList<int[]> path: paths) {
            for(int[] coord: path) {
                string += "(" + coord[0] + " " + coord[1] + ")";
            }
            string += "," + System.lineSeparator();
        }
        return string;
    }
}