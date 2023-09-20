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
	}

}
