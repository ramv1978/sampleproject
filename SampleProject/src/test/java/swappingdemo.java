public class swappingdemo
{
    public static void main(String[] args)
    {
        int a[]= {2,6,1,4,9};
        int temp;

        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i] > a[j])
                // temp,a[i],a[j]
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]);
            System.out.print("\t");
        }
    }
}
// swapping w/o temp variable
// a=a+b;  // a= 9
//b=a-b;  //b = 5
//a=a-b; // a= 4  */