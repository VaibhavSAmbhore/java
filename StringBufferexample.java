class StringBufferexample
{
    public static void main(String arg[])
    {
        StringBuffer sb=new StringBuffer("hello");
        sb.append(" java");//now the String is changed completely
        System.out.println(sb);
    }
}