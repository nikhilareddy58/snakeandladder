package PrototypePattern;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student stu= new Student();
		stu.setAge(12);
		Course c= new Course();
		c.setSubject("telugu");
		stu.setCourse(c);
		
		Student stu2= (Student) stu.clone();
		
		stu2.setAge(13);
		System.out.println(stu.getAge()+" "+stu2.getAge());
		
	}

}
