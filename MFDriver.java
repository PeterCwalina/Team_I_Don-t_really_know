public class MFDriver{
	public static void main(String[] args) {
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
        	MatrixFinder.populateArray(testmatrix1);
        	double sum = 0.0;
        	for (int x = 1; x < 51; x++){
            	timeStart = System.nanoTime();//start timing in nanoseconds
        	    MatrixFinder.matrixFinder(testmatrix1, testmatrix1.length);
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