public class OddEven {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true; 
                    break;
                }
            }

            if (!isDuplicate) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is an even number");
                } else {
                    System.out.println(arr[i] + " is not an even number");
                }
            }
        }
    }
}
