class SumMinMax 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if (arr[i]<min) 
            {
                min=arr[i];
            }
        }
        int add = max+min;
        System.out.println(add);
    }    
}
