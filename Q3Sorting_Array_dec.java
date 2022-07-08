//Q3.Wap enter an array and sort that in decending order

import java.util.*;
class Q3Sorting_Array_dec
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
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

		System.out.println("Sorted element in array= ");
		for(i=0;i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}
/*
Output :

Enter element in array=
3
42
3
5
34
unsorted element in array=
3 42 3 5 34
Sorted element in array=
42 34 5 3 3

*/