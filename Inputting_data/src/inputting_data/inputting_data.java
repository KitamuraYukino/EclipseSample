package inputting_data;

public class inputting_data {

	public static void main(String[] args) {
		//サンプルコード
		//int price = Integer.parseInt(args[0]);
		int price = 5000;
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

	}

}