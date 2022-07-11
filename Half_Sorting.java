/*Q8.Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},
*/
class Half_Sorting
{
	public static void main(String args[])
	{
		int a[]={9,1,3,5,6,11,22,66,10,19};
		System.out.print(" Given Array: ");

		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

		      System.out.println();

		for(int i=0;i<a.length;i++)
		{	
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}

			}
			

		}
		for(int i=a.length/2+1;i<=a.length;i++)
		{	
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}

			}
			

		}

		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}