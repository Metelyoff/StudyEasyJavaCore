
public class Array {

	public static void main(String[] args) {
		
		int[] singledimentional_array = {0,1,2,3};
		//System.out.println(singledimentional_array[2]);
		
		int[][] multidimentional  = {
				{0,1,2,3},
				{25,41,96},
				{5,4,7},
				{8,6}
		};
		
		//System.out.println(multidimentional[2][1]);
	   
		for(int row = 0; row < multidimentional.length ;row++ )
		{
			for(int col = 0; col < multidimentional[row].length ;col++ )
			{
				System.out.print(" "+multidimentional[row][col]);
			}
			System.out.println();
		}
	
	
	}

}
