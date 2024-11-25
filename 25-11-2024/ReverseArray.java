public class ReverseArray 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.print("Reversed Array is : ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
