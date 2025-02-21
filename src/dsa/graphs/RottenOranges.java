package dsa.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};

        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int parentTime = 0;
        Queue<Pair> queue = new LinkedList<>();

        int[] delX = {-1,0,1,0};
        int[] delY = {0,-1,0,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j,parentTime));
                }
            }
        }

        while(!queue.isEmpty()){
            Pair parent = queue.poll();
            int parentRow = parent.row;
            int parentCol = parent.col;
            parentTime = parent.time;

            for(int i=0;i<delX.length;i++){

                int newRow = parentRow + delX[i];
                int newCol = parentCol + delY[i];

                if(isValid(newRow,newCol,grid)){
                    grid[newRow][newCol]=2;
                    queue.offer(new Pair(newRow, newCol, parentTime+1));
                }

            }
        }

        return parentTime;
    }

    public static boolean isValid(int r, int c, int[][] grid){
        return r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==1;
    }

    static class Pair{
        int row;
        int col;
        int time;

        public Pair (int row, int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
}
