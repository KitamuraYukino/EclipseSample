package object;

public class object {

	public static void main(String[] args) {
//		[オブジェクト指向]
//		[サンプルコード]
		
//		int[] engScore = {80, 100, 75, 90};
//		int[] mathScore = {90, 80, 85, 70};
//		String[] name = {"菅原", "村山", "寺島", "須藤"};
//		String[] sub = {"数学", "英語"};
		/*String name;
		int engScore;
		int mathScore;
		
		record display () {
			System.out.println(name + "さん");
			System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
		}
		
		void setScore(int eng. int math) {
			engScore = eng;
			mathScore = math;
		}
		
		double getAvg() {
			double avg = (engScore + mathScore) / 2.0;
			return avg;
		}*/
		
//		for(int i = 0; i < engScore.length; i++) {
//			System.out.println(name[i] + "さん：" + engScore[i] + "点");
//		}
		
		student stu1 = new student();//領域確保
		stu1.name = "北村";//nameに格納
		stu1.setScore(80, 90);//scoreに渡す引数
		stu1.getAvg();//平均値（戻り値）を受け取る
		stu1.display();
		System.out.println("平均" + stu1.getAvg() + "点");

	}

}
/*
class Student {
	
	String name;
	int engScore;
	int mathScore;
	
	void display () {
		System.out.println(name + "さん");
		System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
	}
	
	void setScore(int eng, int math) {
		engScore = eng;
		mathScore = math;
	}
	
	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg;
	}
}
*/