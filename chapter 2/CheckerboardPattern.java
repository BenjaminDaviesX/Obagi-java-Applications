// Java application that displays a checkerboard pattern of asterisks:

public class CheckerboardPattern {
    public static void main(String[] args) {
		
        int rows = 8;
		// number of rows
       
	   int columns = 8;
		// number of columns

        // loop through each row
        for (int i = 0; i < rows; i++) {
           
		   // loop through each column
            for (int j = 0; j < columns; j++) {
                
				// display an asterisk if the sum of the row and column is even
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
					// display a space if the sum is odd
                }
            }
            System.out.println(); 
			// move to the next line
        }
    }
}