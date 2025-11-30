package Graphs;

 public class NumOfIslands {
    
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                
                int area = dfs(grid, r, c);
                
                if (area > 0) {
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    public static int dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0') {
            return 0;
        } 
        
        grid[r][c] = '0';
        
        return 1
            + dfs(grid, r + 1, c)
            + dfs(grid, r - 1, c)
            + dfs(grid, r, c + 1)
            + dfs(grid, r, c - 1);
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{
            {'1', '1', '0', '0'},
            {'0', '1', '0', '1'},
            {'0', '0', '0', '1'},
            {'1', '1', '1', '1'}
        };

        int numIslands = numIslands(grid);
        
        System.out.println("The 4 x 4 grid has: " + numIslands + " islands.");
    }
}
