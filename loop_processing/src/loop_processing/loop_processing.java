package loop_processing;

public class loop_processing {

	public static void main(String[] args) {
//		[配列とループ処理]
//		[サンプルコード]
		int[] score = new int[3];
		score[0] = 80;
		score[1] = 100;
		score[2] = 75;
		
		String[] name = {"菅原", "村山", "寺島"};
		
		System.out.println(name[0] + "さん：" + score[0] + "点");
		System.out.println(name[1] + "さん：" + score[1] + "点");
		System.out.println(name[2] + "さん：" + score[2] + "点");
		System.out.println("受験者数：" + score.length + "名");
		
//		[多次元配列サンプルコード]
//		int[][] allScore = new int[2][3];
		int[][] allScore = { {80, 100,75}, {850, 50, 60} };
		
//		allScore[0][0] = 80;
//		allScore[0][1] = 100;
//		allScore[0][2] = 75;
//		allScore[1][0] = 85;
//		allScore[1][1] = 95;
//		allScore[1][2] = 80;
		
		System.out.println(allScore[0][0] + "点");
		System.out.println(allScore[0][1] + "点");
		System.out.println(allScore[0][2] + "点");
		System.out.println(allScore[1][0] + "点");
		System.out.println(allScore[1][1] + "点");
		System.out.println(allScore[1][2] + "点");
		
		System.out.println("allScore.length：" + allScore.length);
		System.out.println("allScore[0].length：" + allScore[0].length);
		
//		[ループ処理サンプルコード]
		/*int i = 0;
		while(i < 3) {
			System.out.println("i = " + i);
			i++;
		}*/
		
		for(int i = 0; i < 3; i++) {
			System.out.println("i = " + i);
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(name[i] + "さん：" + score[i] + "点");
		}
		System.out.println("受験者数：" + score.length + "名");
		
		
//		[課題１：int xでxの段の九九を表示]
		int x = Integer.parseInt(args[0]);
		System.out.println("xを入力してください：" + x);
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(i * x);
		}
		
//		[課題２：配列の数について出力]
		int[] nums = {20,1,2,23,5,11,5,6,7};
		
		for(int i = 0; i <= nums.length; i++) {
			System.out.println(nums.length[4]);
		}
	}

}
