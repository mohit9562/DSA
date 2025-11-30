package Graphs;
import java.util.*;
public class MaxAreaOfIsland {
    
    public static int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, r, c));
                }
            }
        }
        return maxArea;
    }

    public static int dfs(int[][] grid, int r, int c) {
        
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

       
        grid[r][c] = 0;

        return 1 + dfs(grid, r + 1, c)+ dfs(grid, r - 1, c) + dfs(grid, r, c + 1) + dfs(grid, r, c - 1); 
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
            {0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 0, 1, 0}, 
            {0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1}
        };

        int maxArea = maxAreaOfIsland(grid);
        System.out.println("Max Area of Island: " + maxArea); 
    }
}
