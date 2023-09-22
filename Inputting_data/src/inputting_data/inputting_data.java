package inputting_data;

public class inputting_data {

	public static void main(String[] args) {
		//[データの入力と条件分岐]
		//サンプルコード
		int price = Integer.parseInt(args[0]);
		double rate = 0.10;
		int discount, amount;
		
		if(price >= 5000) {
			discount = 500;
		} else if (price >= 3000){
			discount = 300;
		} else {
			discount = 0;
		}
		
		amount = (int)((price - discount) * (1 + rate));
		System.out.println("値引金額" + discount + "円");
		System.out.println("税込金額" + amount + "円");
		
		//[Switch文サンプルコード]
		int num = Integer.parseInt(args[1]);
		switch( num ) {
		case 1:
			System.out.println("入園料金：8,400円");
			break;
		case 2:
			System.out.println("入園料金：7,000円");
			break;
		case 3:
			System.out.println("入園料金：5,000円");
			break;
		default:
			System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
		}
		
		//[課題１：上記Switch文をif文に変換]
//		int num = Integer.parseInt(args[1]);
		
		if(num == 1) {
			System.out.println("入園料金：8,400円");
		} else if(num == 2) {
			System.out.println("入園料金：7,000円");
		} else if(num == 3) {
			System.out.println("入園料金：5,000円");
		} else {
			System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
		}
		
		//[課題２：2つの整数を受け取り大きい方を表示する]
		
		int numA = Integer.parseInt(args[2]);
		int numB = Integer.parseInt(args[3]);
		
		System.out.println("数字Aを入力してください：" + numA);
		System.out.println("数字Bを入力してください：" + numB);
		
		if(numA > numB) {
			System.out.println("大きい数字は" + numA + "です");
		} else if(numA < numB) {
			System.out.println("大きい数字は" + numB + "です");
		} else {
			System.out.println("2つの数字は等しいです");
		}
		
		
		//[課題３：正の整数を入力し偶数か奇数かを判断]
		int numC = Integer.parseInt(args[4]);
		
		System.out.println(numC);
		
		if(numC % 2 == 0) {
			System.out.println(numC + "は偶数である");
		} else {
			System.out.println(numC + "は奇数である");
		}
		
		switch( numC % 2 ) {
		case 0:
			System.out.println(numC + "は偶数である");
			break;
		case 1:
			System.out.println(numC + "は奇数である");
			break;
		default:
			System.out.println(numC + "は無効である");
		}
		
//		[回答完了]
	}

}
