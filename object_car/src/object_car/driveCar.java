package object_car;

public class driveCar {

	public static void main(String[] args) {
		//Carクラスのオブジェクトci生成
		
		car c1 = new car();
		
		//c1のナンバーを２５２５に設定
		
		c1.no = 2525;
		
		//c1の速度を３０に設定
		
		c1.run(30);
		
		//c1のナンバー、速度を表示
		
		c1.display();
		
		//c1の速度を０に設定
		
		c1.stop();
		
		//c1のナンバー、速度を表示
		
		c1.display();
	}

}
