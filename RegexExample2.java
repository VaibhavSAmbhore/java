import java.util.regex.*;
class RegexExample2
{
  public static void main(String args[])
  {
    System.out.println(Pattern.matches(".s","as"));
    System.out.println(Pattern.matches("..v","avv"));
    System.out.println(Pattern.matches("..c","asc"));
    System.out.println(Pattern.matches(".v","av"));
  }
}