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
			System.out.print(i * x + " ");
		}
		
		System.out.println();
		
//		[課題２：配列の数について出力]
		int[] nums = {20,1,2,23,5,11,5,67};
		
//		[4番目の要素]
		int targetIndex = 3;
		int fourthElement = -1;
		
		for(int i = 0; i < nums.length; i++) {
			if(i == targetIndex) {
				fourthElement = nums[i];
				
				System.out.println("4番目の要素は" + fourthElement);
				break;
				
			}
		}
		
//		[要素数]
		int count = 0;
		for(int i = 1; i < nums.length; i++) {
			count++;
		}
		
		System.out.println("配列の要素数は" + count);
		
//		[平均値]
		double average = 0.0;
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		if (count > 0) {
			average = (double) sum / count;
		}
		
		System.out.println("配列の平均値は" + average);
		
//		[課題３：二次元配列]
		
		int[][] array = {
				{1, 8, 12, 17, 20},
				{2, 5, 11, 13, 18},
				{4, 6, 9, 19, 21},
		};
		
		for(int i = 0; i < array.length; i++) {
			
			for(int i1 = 0; i1 < array[i].length; i1++) {
				int data = array[i][i1];
				String space;
				String dataStr = Integer.toString(data);
				
				if(dataStr.length() == 1) {
					space = "  ";
				} else {
					space = " ";
				}
				
				System.out.print(array[i][i1] + space);
			}
			
			System.out.println();
			
		}
		
		
//		[課題４：ピラミッド出力]
		
		for(int i = 1; i <= 4; i++) {
			String data = "$";
			
			for(int i1 = 1; i1 <= i; i1++) {
				System.out.print(data);
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 4; i++) {
			String data = "$";
			String space = " ";
			
			for(int i2 = 1; i2 <= 4 - i; i2++) {
				System.out.print(space);
			}
			
			for(int i1 = 1; i1 <= i; i1++) {
				System.out.print(data);
			}
			
			System.out.println();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
	}

}
