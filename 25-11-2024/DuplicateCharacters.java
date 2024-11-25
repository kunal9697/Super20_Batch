class DuplicateCharacters {
    public static void findoccurence(String str) {
        char arr[] = str.toCharArray();
        System.out.println("Duplicate Characters: ");
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != '\0') {
                boolean isDuplicate = false; 
                for (int j = i + 1; j < str.length(); j++) {
                    if (arr[i] == arr[j] && arr[i] != ' ') {
                        arr[j] = '\0'; 
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    System.out.print(arr[i] + " "); 
                    arr[i] = '\0'; 
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "kunal anandrao jadhavh";
        findoccurence(str);
    }
}
