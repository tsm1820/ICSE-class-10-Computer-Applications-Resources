/* 
SIMPLE ARRAY PROGRAM TO TAKE INPUT AND PRINT ALL 
ELEMENTS OF THE ARRAY
*/
import java.util.Scanner;//PRINT ALL ELEMENTS
class test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int id[]=new int[10]; //CREATES ARRAY OF SIZE 10
		for(int i=0;i<id.length;i++) //TRAVERSES THE ENTIRE LENGTH OF THE ARRAY TO TAKE INPUT
		{
			System.out.println("Enter "+i+" element");
			id [i]=sc.nextInt();
		}
		//PRINT LOOP
		for(int i=0;i<id.length;i++)
		{
			System.out.println("\t"+i+"->"+id[i]);//Array is always represented by id[i]
		}
	}
}
