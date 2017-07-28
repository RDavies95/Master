
public class Spiral {

	public static void main(String[] args) {
		
		
		int input = 5;
		print2dArray(getMatrix(input));
		
	}
		
		
		public static int[][] getMatrix(int input)
		{
			
		int[][] multD = new int[input][input];	
		int currnum = 1;	
		
		int consquare = (int) Math.ceil((input/2.0));
		
		int sidelength = input;
		
		
		for(int x = 0; x < consquare; x++)
		{
		//Top side	
		
			for(int g = 0; g < sidelength; g++)
			{
				multD[x][g + x] = currnum++;
			}
			
		//right side
			
			for(int f = 1; f < sidelength; f++)
			{
				multD[f + x][sidelength - 1 - x] = currnum++;
			}
			
		//do the bottom side
			
			for(int t = sidelength - 2; t > - 1; t-- )
			{
				multD[sidelength- 1 - x ][x + t] = currnum++;
			
			}
				
			//do the left hand side
				
			for(int q = sidelength - 2; q > 0; q--)
			{
				multD[x + q][x] = currnum++;
			
			}
			
			sidelength -= 2;	
		}
		
		return multD;
			
		}
		
		public static void print2dArray(int[][] array) {
		    for (int[] row : array) {
		      for (int elem : row) {
		        System.out.printf("%3d", elem);
		      }
		      System.out.println();
		    }
		  }
		
		
		
		

	}

