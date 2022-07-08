// Q6.Wap enter an array and search any two element and print the result.

import java.util.*;
class Searching2element
{
	public static void main(String []args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter element in array :");
		
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Searching element");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		System.out.println();
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]==s1)
				System.out.println(s1+ " found at" +(i+1)+" position");
			if(a[i]==s2)
				System.out.println(s2+" found at" +(i+1)+" position");

		}
		System.out.println();


	}
}

/*
Output :
Enter element in array :
3
4
2
7
5
9
Enter Searching element
4
9

4 found at2 position
9 found at6 position

*/