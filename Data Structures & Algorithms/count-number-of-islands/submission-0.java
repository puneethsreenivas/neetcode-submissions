class Solution {
    public int numIslands(char[][] grid) {
        int island=0;
        
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    island++;
                    dfs(grid,i,j);


                }
            }
        }
        return island;
    }
    private void dfs(char[][] grid,int i, int j){
        int row=grid.length;
        int col=grid[0].length;
        if(i<0||i>=row||j<0||j>=col||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
