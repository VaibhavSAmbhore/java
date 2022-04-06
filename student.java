class student{
	
	int rollno;
	String name;
	public static void main(String arg[])
	{
		student s1 = new student();
		student s2 = new student();

		s1.rollno=11;
		s1.name="nitin";
		s2.rollno=12;
		s2.name="rocky";

	
		System.out.println(s1.rollno+" "+s1.name);
		System.out.println(s2.rollno+" "+s2.name);	
	}
}