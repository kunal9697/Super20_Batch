class SecondLargest 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        int firstmax=0;
        int secondmax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstmax)
            {
                firstmax=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondmax && arr[i]!=firstmax)
            {
                secondmax=arr[i];
            }
        }
        System.out.println("First Max : "+firstmax);
        System.out.println("Second Max : "+secondmax);
    }    
}
