class MyIndexOf 
{
    public static int position(String str, String s, int index)
    {
        for (int i = index; i < str.length(); i++)
        {
            if (str.charAt(i) == s.charAt(0))  
            {
                return i;  
            }
        }
        return -1;  
    }

    public static void main(String[] args) 
    {
        String str = "Hello planet earth, you are a great planet.";
        System.out.println(position(str, "e", 4));  
    }    
}
