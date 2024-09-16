package dsa.graphs;

public class FloodFill {

    public static void main(String[] args) {
        int[][] image = new int[4][4];
        int color = 2;
        int initialColor = image[1][2];
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};

        dfs(image,initialColor,delRow,delCol,1,2,color);
    }

    public static void dfs(int[][] image, int initialColor, int[] delRow, int[] delCol, int row, int col, int color){
        image[row][col] = color;
        int n = image.length;
        int m = image[0].length;

        for(int i=0;i<4;i++){
            int newRow = row + delRow[i];
            int newCol = col + delCol[i];

            if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && image[row][col]==initialColor && image[row][col]!=color){
                dfs(image,initialColor,delRow,delCol,newRow,newCol,color);
            }
        }
    }
}
