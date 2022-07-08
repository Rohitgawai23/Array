// Q2.Wap enter an array and sort that in accending order.

import java.util.*;
class Q2Sorting_Array_acc
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
				if(a[i]>a[j])
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
12
42
32
31
42
43
12
34
22
32
unsorted element in array=
12 42 32 31 42 43 12 34 22 32
Sorted element in array=
12 12 22 31 32 32 34 42 42 43
*/