
public class Trst {
	
	public static void main(String[]args){
		
		DoubleArrays b= new DoubleArrays();
	    double [] x= b.createZerosArray(5);
	    b.displayArray(x);
	    double [] x1=b.createSequenceArray(5);
	    DoubleArrays.displayArray(x1);
	    double [][] x2=b.createMatrix(3, 3);
	    DoubleArrays.displayMatrix(x2);
        
	    
	    
	    DoubleArrays.multiply(2, x1);
	    double [][] x3=new double[][]{
	    	  { 1.0, 1.0, 1.0, 1.0, 1.0 },
	    	  { 2.0, 2.0, 2.0, 2.0, 2.0 },
	    	  { 3.0, 3.0, 3.0, 3.0, 3.0 },
	    	  { 4.0, 4.0, 4.0, 4.0, 4.0 },
	    	  { 5.0, 5.0, 5.0, 5.0, 5.0 }
	    	};
	    
	    DoubleArrays.multiply(2, x3);
	    double [] h=new double[]{1.1,4.4,7.7};
	    double [][]y=new double[][]{{2.2,5.5},{9.9,2.2}};
	    DoubleArrays.reset(h);
	    DoubleArrays.displayArray(h);
	   DoubleArrays.reset(y);
	    DoubleArrays.displayMatrix(y);
	  
	    DoubleArrays.swapRows(x3, 1, 2);
	    DoubleArrays.displayMatrix(x3);
        DoubleArrays.getPyramid(2);
        DoubleArrays.displayMatrix(DoubleArrays.getPyramid(2));
        DoubleArrays.getStrings(x2);
        DoubleArrays.makeThreeRows(1.1,2.2,3.3);
        DoubleArrays.displayMatrix(DoubleArrays.makeThreeRows(1.1,2.2,3.3));
	    DoubleArrays.createMatrix(3, 3, 5.0);
	    DoubleArrays.displayMatrix( DoubleArrays.createMatrix(3, 3, 5.0));
	   
	    double [][] z=new double[][]{{5.5,7.7,8.8},{2.2,4.4,6.6},{1.1,0.0,3.3}};
	    DoubleArrays.swapColumns(z, 1, 2);
	    DoubleArrays.displayMatrix(z);
	    DoubleArrays.arrayToString(x1);
	    System.out.println("\n");
	    DoubleArrays.arrayToString(z);
	}
	

}
