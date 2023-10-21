package modifier;

public class modifier {

	public static void main(String[] args) {
/*		実行する方
		Student.display();
		
		Student stu1 = new Student("北村");
		Student.display();
		
		Student stu2 = new Student("武内");
		Student.display();
*/		
		
//		アクセス修飾子
		Student stu3 = new Student("北村");
		stu3.setScore(80);
		stu3.display1();
		
		Student stu4 = new Student("武内");
		stu4.setScore(-50);
//		stu4.scoreA = -50;
		stu4.display1();
		

	}

}
