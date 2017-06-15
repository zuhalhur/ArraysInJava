import java.util.Arrays;

public class DoubleArrays {
	
	 public static double[] createZerosArray(int size){
			
	        double []a=new double[size];
	    	
	        for(int i=0;i<a.length;i++){
	    	
	        	a[i]=0.0;
	    		
	    	}
	    	
	    	return a;
			
		}
	    public static void displayArray(double[] dblArray){
	    	System.out.println("Array is : ");
for(int k=0;k<dblArray.length;k++){
	System.out.println(dblArray[k]);
}
	    	
	    	
	    }
		
	    public static double[] createSequenceArray(int size){
	    	
	    	double [] b=new double[size];
	    	double x=1.0;
	    	
	    	for(int j=0;j<b.length;j++){
	    		
	    		b[j]=x*j;
	    	}
	    	return b;
	    	
	    }
	    
	    public static double[][] createMatrix(int numRows,int numColumns){
	    	
	    	double [][] c=new double[numRows][numColumns];
	    	for(int k=0;k<c.length;k++){
	    		for(int t=0;t<c.length;t++)
	    			c[k][t]=0;
	    	}
	    	return c;
	    	   	
	    	
	    }
	    public static void displayMatrix(double[][] dblMatrix){
	    	System.out.println("Matrix is : ");
	    	for (int i = 0; i < dblMatrix.length; i++) {
	    	    for (int j = 0; j < dblMatrix[i].length; j++) {
	    	        System.out.print(dblMatrix[i][j] + " ");
	    	    }
	    	    System.out.print("\n");
	    	}
	    }
	    
	   public static void reset(double[] dblArray){
	    	
		  
	    		for(int i=0;i<dblArray.length;i++)
	    			if(dblArray[i]!=0.0){
	    			dblArray[i]=0.0;
	    	}
	    			else
	    				dblArray[i]=0.0;
	   }
	   public static void reset(double [][] dblMatrix) {
		   for(int i=0;i<dblMatrix.length;i++){
			   for(int j=0;j<dblMatrix.length;j++)
				   if(dblMatrix[i][j]!=0.0){
					   dblMatrix[i][j]=0.0;
				   }
				   else 
					   dblMatrix[i][j]=0.0;
		   }
		
	}
	    	
	    

	   	    public static void multiply(double k, double[] dblArray){
        
	    System.out.println("New array is : ");	
	    	
	    	for(int i=0;i<dblArray.length;i++){
	    		dblArray[i]=dblArray[i]*k;
	    		
	    	
	    	System.out.println( dblArray[i]);
	    }
	    }
	    public static void multiply(double k, double[][] dblMatrix){
	    	
	    	System.out.println("New matrix : ");
	    	   
	    	   for(int i=0;i<dblMatrix.length;i++){
	    		   for(int j=0;j<dblMatrix.length;j++){
	    			  System.out.print(" " + dblMatrix[i][j]*k);
	    	   }
	System.out.println("\n");    	
	    }
}
	   public static void swapRows(double[][] dblMatrix, int i, int j){
	    	
	    	double [] temp = new double[dblMatrix.length];
	    	temp = dblMatrix[i];
	    	dblMatrix[i] = dblMatrix[j];
	    	dblMatrix[j] = temp;
	    	
}
	  public static void swapColumns(double[][] dblMatrix,int i, int j){
		   
		   double [][] temp = new double [dblMatrix.length][1];
		   for(int k=0;k<dblMatrix.length;k++ ){
			   temp[k][0]=dblMatrix[k][i];
			   dblMatrix[k][i]=dblMatrix[k][j];
			   dblMatrix[k][j]=temp[k][0];
			   
			   
		   }
		   
	   }
  public static double[][] getPyramid(int k){
	   double [][]a = new double[k][];
	  
	    for(int i=0;i<k;i++){
	    	a[i]=new double [i+1];
	    	for(int j=0;j<=i;j++){
	    		
	    	a[i][j]=(1.1)*(j+1);
	    	}
	    		
	    	}
	    	return a;
	    
	    	
	    	
	    	
	    }
	    public static String[][] getStrings(double[][] a){

	    	String[][] s = new String[a.length][];
System.out.println("New output : ");
	    	for (int i = 0; i < s.length; i++){
	    	s[i] = new String[a[i].length];
	    		for(int j=0 ; j<s[i].length;j++){
	    			 
	    			 s[i][j]=Double.toString(a[i][j]);
				System.out.printf("%s  ",s[i][j]);
	    		
	    	}
	    }
			return s;
	    
}
	    public static double[][] makeThreeRows(double... dblList){
	    	System.out.println("Double list array is : ");
	    	double [][]z=new double [3][dblList.length];
	    	
	    	for(int i=0;i<3;i++){
	    		z[i]=dblList;
	    		
	    	}
	    	return z;
	    }
	    public static double[][] createMatrix(int numRows,int numCols, double d) {
	    	double [][] w=new double[numRows][numCols];
	    	for(int i=0;i<numRows;i++){
	    		for(int j=0;j<numCols;j++){
	    			w[i][j]=d;
	    			
	    		}
	    	}
	    	return w;
	    }
	    public static String arrayToString(double[] dblArray){
			String a=" ";
			for(double a1 : dblArray){
				a +=a1+" ";
			}
			System.out.println("String is : ");
			System.out.printf("%s",a);
			return a;
		}
		
		public static String arrayToString(double[][] dblMatrix){
			String a=" ";
			for(double[] a1 : dblMatrix){
				a +=Arrays.toString(a1)+"\n";
			}
			System.out.println("String is : ");
			System.out.printf("%s",a);
			return a;
		}
	   
}