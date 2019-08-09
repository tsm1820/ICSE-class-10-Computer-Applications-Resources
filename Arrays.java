import java.util.Scanner;//PRINT ALL ELEMENTS
class test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int id[]=new int[10];
		for(int i=0;i<id.length;i++)
		{
			System.out.println("Enter "+i+" element");
			id [i]=sc.nextInt();
		}
		//print loop
		for(int i=0;i<id.length;i++)
		{
			System.out.println("\t"+i+"->"+id[i]);//array is always represented by id[i]
		}
	}
}
