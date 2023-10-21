package modifier;

public class Student {
/*設計図の方
	
	String name;
	static int counter = 0;
	
	Student(String n) {
		name = n;
		counter++;
		System.out.println(name + "さんをインスタンス化しました");
	}
	
	static void display() {
		System.out.println(counter + "人です");
	}
	
*/	
//	カプセル化、アクセス修飾子
	
	private String nameA;
	private int scoreA;
	
	public Student(String x) {
		nameA = x;
	}
	public void setScore(int s) {
		if(0 <= s && s <= 100) {
			scoreA = s;
		} else {
			System.out.println(nameA + "さんの点数が範囲外です");
			scoreA = 0;
		}
	}
	
	void display1() {
		System.out.println(nameA + "さん：" + scoreA + "点");
	}
}
