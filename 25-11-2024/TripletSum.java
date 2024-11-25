class TripletSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6,7,8,9,10,11,1,2};
        if(arr.length<3)
        {
            System.out.println("Can not form triplets becuz array does not have more then 3 elements");
        }
        else
        {
        for (int i = 0; i < arr.length - 2; i++) {  
            for (int j = i + 1; j < arr.length - 1; j++) {  
                for (int k = j + 1; k < arr.length; k++) {  
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum==25)
                    {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"+"+" = "+sum);
                    }
                }
            }
        }
        }
    }
}
