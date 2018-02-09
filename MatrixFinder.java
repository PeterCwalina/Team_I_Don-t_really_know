//Team I dont really know
//Maryann Foley and Peter Cwalina
//APCS2 pd 8
//HW03 I am still searching
//2018-02-01
/*
  Our algoritim
  The algorithm uses the fact that anything above the diagonal of the matrix  will be less than it
  and anything to the right would be greater than the number in the diagonal
  If the target is less than the position it is looking at then it would go up one and if its greater then it would go right one
  Ex:
  | 1 20 22 |
  | 2 25 30 |
  | 3 30 32 |
  target 32
  starts at 2,0
  3 < 32 go to the right
  2,1
  30 < 32 go right
  2, 2
  32 = 32 target found
*/
public class MatrixFinder{

    public static String matrixFinder(int[][] matrix, int target){
    int n = matrix.length; //sets variable to length so that length wont have to be calculated again in future
    int row = n - 1; //bottom row
    int col = 0; //all the way to the left
    while(true){ //will break loop with returns
        if (row < 0 || col >= n){//return (-1,-1) if it winds up out of the matrix
        return "(-1,-1)";
        }
        if (matrix[row][col] == target){ //if it found target it will return it's coordinates
        return ("("+row+","+col+")");
        }
        else if(target < matrix[row][col]){//if target is less than the what we're looking at move up one
        row -= 1;
        }
        else{//if target is greater than what we're looking at move to the right 1
        col += 1;
        }
    }
    }
    public static void populateArray (int[][] arr){
    int pop = 1;
    for (int x = 0; x < arr.length;x++){
        for (int y = 0;y < arr.length;y++){
        arr[x][y] = pop;
        pop+= 1;
        }
    }
    }




    public static void main(String [] args){
    double timeStart;
    double timeEnd;
    //worst case scenario testing
    
    //runs some extra cases as a warmup
    for (int y = 30000; y > 0;y-=1000){ //16000 was observed to be max size runnable
        int[][] testmatrix1;
        if (y >= 17000){
            testmatrix1 = new int[16000][16000];
        }
        else{
            testmatrix1 = new int[y][y];
        }
        populateArray(testmatrix1);
        double sum = 0.0;
        for (int x = 1; x < 51; x++){
            timeStart = System.nanoTime();//start timing in nanoseconds
            matrixFinder(testmatrix1, testmatrix1.length);
            timeEnd = System.nanoTime();//end timing
            double timeDif =(timeEnd - timeStart);
            sum+= timeDif;
        }
        if (!(y>=17000)){
            System.out.println(y+","+(sum/50));
        }
    }





    }
}
