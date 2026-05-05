class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                   int area = dfs(grid,i,j);
                   count=Math.max(count,area);
                    
                }
            }
        }
        return count;
        
    }
    private int dfs(int[][] grid,int i,int j){
        int row=grid.length;
        int col=grid[0].length;
        if(i<0||i>=row||j<0||j>=col||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int area=1;
        area += dfs(grid, i + 1, j); // down
        area += dfs(grid, i - 1, j); // up
        area += dfs(grid, i, j + 1); // right
        area += dfs(grid, i, j - 1); // left
        return area;
       
    }
}
