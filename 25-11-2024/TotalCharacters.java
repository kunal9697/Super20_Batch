class TotalCharacters{
    public static int countCharacters(String str) 
    {
        int count = 0; 
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) != ' ') 
            { 
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Kunal Anandrao Jadhav";
        int totalCharacters = countCharacters(str);
        System.out.println("Total number of characters : " + totalCharacters);
    }
}
