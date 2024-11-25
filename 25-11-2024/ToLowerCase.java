class ToLowerCase 
{
    public static String lowerCase(String str)
    {
        char result[]=str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            if(result[i]>='A' && result[i]<='Z')
            {
                result[i] = (char)(result[i]+32);
            }
        }
        return new String(result);
    }
    public static void main(String[] args) 
    {
        String s = "MY NAME IS KUNAL JADHAV";
        System.out.println(lowerCase(s));
    }    
}
