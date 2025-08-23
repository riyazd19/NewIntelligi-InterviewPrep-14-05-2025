package poblems;

public class NumberOfIslandsInt {
    public int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Traverse the entire grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    dfs(grid, i, j); // Mark the island
                }
            }
        }

        return count;
    }

    // DFS to mark all connected land cells
    private void dfs(int[][] grid, int i, int j) {
        // Base case: out of bounds or not land
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] != 1) {
            return;
        }

        // Mark the cell as visited by setting it to 0
        grid[i][j] = 0;

        // Visit all 4 adjacent directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        NumberOfIslandsInt obj = new NumberOfIslandsInt();
        int result = obj.numIslands(grid);
        System.out.println("Number of islands: " + result);  // Output: 3
    }
}
