package dsa.graphs;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int count = 0;
    boolean flag = false;
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]==2){
                    vis[i][j] = true;
                    bfs(vis,grid,i,j,delRow,delCol);
                }
            }
        }

        return count;

    }

    public void bfs(boolean[][] vis, int[][] grid, int r, int c,int[] delRow, int[] delCol){
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(r,c));
        int n = grid.length;
        int m = grid[0].length;

        while(!queue.isEmpty()){
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();

            for(int i=0;i<4;i++){
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && grid[newRow][newCol]==1 && !vis[newRow][newCol]){
                    vis[newRow][newCol] = true;
                    grid[newRow][newCol] = 2;
                    queue.offer(new Pair(newRow,newCol));
                    flag = true;
                }
            }
            if(flag){
                count = count + 1;
            }

            flag = false;

        }

    }

    class Pair{
        int first;
        int second;

        Pair (int first, int second){
            this.first=first;
            this.second=second;
        }
    }
}
