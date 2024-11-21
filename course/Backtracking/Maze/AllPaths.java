package course.Backtracking.Maze;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true , true},
                {true, true, true}
        };
        allpaths("", board, 0, 0);

    }

    static void allpaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if ( r < maze.length-1){
            allpaths(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1){
            allpaths(p + 'R',maze, r, c+1);
        }

        if ( r > 0){
            allpaths(p + 'U', maze, r-1, c);
        }

        if (c > 0){
            allpaths(p + 'R',maze, r, c-1);
        }



    }
}
