class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 4, 6, 7, 8, 9, 8, 1, 45, 6, 54, 44, 44};
        int arr2[] = new int[arr.length]; 
        boolean isDuplicate;
        int index = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) { 
                continue; 
            }

            isDuplicate = false; 
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true; 
                        arr[j] = -1; 
                }
            }
            if (!isDuplicate) {
                arr2[index++] = arr[i];
            }
        }
        System.out.println("Unique elements:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr2[i]);
        }
    }
}
