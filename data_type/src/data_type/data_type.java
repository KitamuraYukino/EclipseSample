package data_type;

public class data_type {

	public static void main(String[] args) {
		
//		[様々なデータ型とキャスト]
//		[サンプルコード]
		int price = Integer.parseInt(args[0]);
		double rate = 0.08;
		int amount;
		
		amount = (int)(price * (1 + rate));
		System.out.println("税込金額" + amount + "円");
		
//		[課題]
		
		int iNum = 3;
		float fNum = 3.4f;
		double dNum = 7.9;
		
		if(iNum > 5) {
			iNum = fNum; //line1
			System.out.println(iNum);
		} else {
			fNum = dNum; //line2
			System.out.println(fNum);
		}
		
//		課題分にあるコードの場合は、line1,line2ともに
//		大きなデータ型から小さなデータ型になるため、
//		どちらもコンパイルエラーが発生する。
	}

}
