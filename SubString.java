class SubString
{
    public static void main(String arg[])
    {
        String S = "sachin tendulkar";
        System.out.println("original String is "+S);
        System.out.println("SubString is starting for index is: "+S.substring(6));
        System.out.println("SubString is Starting for index is:"+S.substring(0,6));
        System.out.println(S.toUpperCase());
        System.out.println(S.toLowerCase());
        System.out.println(S.startsWith("sa"));
        System.out.println(S.endsWith("r"));
       System.out.println(S.charAt(5));
       System.out.println(S.length());
     /*  int a= 10;
       String V= String.valueOF(V);
       System.out.println(V+10);
      */ 
    }
}