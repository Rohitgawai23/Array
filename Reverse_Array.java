// wap reverse array 

import java.util.*;
class Reverse_Array
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Enter element");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
	
		System.out.println("Array element");
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]+" ");
		}

		System.out.println("Reverse Array");
		for(int i=4; i>=0; i--)
		{
			System.out.println(a[i]+" ");
		}

	}
}
/*
Output :

Enter element
2
3
4
5
6
Array element
2
3
4
5
6
Reverse Array
6
5
4
3
2

*/