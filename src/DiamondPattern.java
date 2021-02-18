
public class DiamondPattern {

	public static void main(String[] args) {
		int i,j,k;
		
		for(i=1;i<=9;i++);
		{
			if(i<=5)
			{
				//printing space
				for(int space=0;space<5-i;space++)
				{
					System.out.println("  ");
				}
				
				//printing stars
				int star=9-(2*(5-i));
				for(j=1;j<=star;j++)
				{
					System.out.println(" * ");
				}
			}
		}

	}

}
