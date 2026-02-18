package day5;

import java.util.Scanner;

public class Array2DDemo {

	public static void main(String[] args) {
						//    row col
		int matrix[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.println("Enter A number");
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");			//1	  2	  3
			}													//4   5   6
			System.out.println();
		}
		
		

	}

}
