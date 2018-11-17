
public class MatrixOne {

	
	public static void main(String args[]) {
		
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{10,11,12},{13,14,15},{16,17,18}};
		
		//creating another matrix to store a value
		
		int c[][]=new int[2][2];
		
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		
		
	}
}
