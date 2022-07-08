// Q4.Wap enter an array and find the second max element.

import java.util.*;
class Q4Sorting_Array_secondmax
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		int i,j,k;
		
		System.out.println("Enter element in array= ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("unsorted element in array= ");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();	
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)		
			{
				if(a[i]<a[j])
				{
				   k=a[j];
				   a[j]=a[i];
				   a[i]=k;
				}
			}
		}

		System.out.println("second maximum : "+a[1]);
		

	}
}
/*
Output :

Enter element in array=
1
2
3
4
5
6
7
88
9
9
unsorted element in array=
1 2 3 4 5 6 7 88 9 9
second maximum : 9
*/