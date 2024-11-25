class Triplets {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        if(arr.length<3)
        {
            System.out.println("Can not form triplets becuz array does not have more then 3 elements");
        }
        else
        {
        for (int i = 0; i < arr.length - 2; i++) {  
            for (int j = i + 1; j < arr.length - 1; j++) {  
                for (int k = j + 1; k < arr.length; k++) {  
                    System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                }
            }
        }
        }
    }
}
