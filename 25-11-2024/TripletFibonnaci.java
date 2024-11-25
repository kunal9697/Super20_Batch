class TripletFibonnaci 
{
    public static void main(String[] args) 
    {
        int first = 0;
        int second = 1;
        int third=1;    
        int fourth;
        for(int i=0;i<10;i++)
        {
            fourth = first+second+third;
            System.out.println(fourth+" ");
            first = second;
            second = third;
            third = fourth;
        }
    }    
}
