//Exercise 2.31 write an application that calculates the squares and 
//cubes of the numbers from 0 to 10 and prints the resulting values in table format,as shown below.

public class SquaresAndCubes {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "\t" + i*i + "\t" + i*i*i);
        }
    }
}