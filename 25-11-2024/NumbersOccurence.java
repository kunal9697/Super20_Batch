
import java.util.Arrays;

public class NumbersOccurence 
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,4,5,6,2,1,7,9,7};
        int arr2[] = new int[arr.length];
        Arrays.fill(arr2,0);
        for(int i = 0;i<arr.length;i++)
        {
            arr2[arr[i]]++;
        }
        System.out.println("Count of the Numbers Occured : ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(i+" has occured "+arr2[i]+" times");
        }   
    }
}
