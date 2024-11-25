class CharactersOccurence 
{
    public static void findoccurence(String str)
    {
        char arr[] = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            int count=1;
            if(arr[i]!='\0' && arr[i]!=' ')
            {
                for(int j=i+1;j<str.length();j++)
                {
                    if(arr[i]==arr[j])
                    {
                        arr[j]='\0';
                        count++;
                    }
                }
                System.out.println(arr[i]+" has occured "+count+" times");
            }
            }
    }
    public static void main(String[] args) 
    {
        String str = "kunal anandrao jadhav";
        findoccurence(str);
    }    
}
