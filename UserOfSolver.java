public class UserOfSolver {
    public static void main(String[] commandLine) {
        MazeSolver solve = new MazeSolver("maze.txt");
        System.out.println(solve);
        solve = new MazeSolver("maze1.txt");
        System.out.println(solve);
    }
}