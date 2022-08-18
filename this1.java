 /*public class student
{
  int rollno;
  String name;
  double fee;
   student(int rollno,String name,double fee);
  {
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
  }
   void display(){
    System.out.println(rollno+" "+name+" "+fee);}
}*/
class this1
{
  public static void main (String arg[])
  {
     Student obj = new Student(27,"vaibhav",25000);
       obj.display();
  }
}
 class Student
{
  int rollno;
  String name;
  double fee;
   Student(int rollno,String name,double fee)
  {
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
  }
   void display(){
    System.out.println(rollno+" "+name+" "+fee);}
}