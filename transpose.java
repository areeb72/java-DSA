public class transpose{
public static void main(String[] args) {
    int matrix [][] = {
        {1,2,3},
        {4,5,6},
        {9,8,7}
    };
    System.out.println(transposeMatrix(matrix));
    
}
static int [][] transposeMatrix(int [][]matrix){
    
int rows = matrix.length;
int column = matrix[0].length;
int ans [][] = new int [column][rows];
for(int i = 0; i<rows; i++){
    for(int j = 0; j<column; j++){
        ans [j][i]= matrix[i][j];
    }
}
    return ans;
    

}
}