class Break
{
    public static void main(String arg[])
    {
        for(int x=1;x<=6;x++)
        {
            System.out.println("x is "+x); 
            if (x==3)
            {
                System.out.println("break the statement");
                break;
            }
           

        }
        System.out.println("Exit");
    }
}