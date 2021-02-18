import java.util.*;
public class Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)     { //rows
		
			for(int s=0;s<(rows-i);s++)   { // spaces
			
				 System.out.print( " ");
				 
			}
				 for(int j=0;j<(i*2-1);j++)  {
				 
		         System.out.print( "*");   
			}
		System.out.println();
		

	}

}
}
