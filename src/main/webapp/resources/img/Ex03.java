package day11;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		boolean[] num = new boolean[45];
		int[] lotto = new int[6];
		Random ran = new Random();
		for(int i =0;i<lotto.length;i++) {
			
			do{
				lotto[i] = ran.nextInt(45);
			}while(num[lotto[i]] == true);
				num[lotto[i]] =true;
		}
		for(int i =0;i<lotto.length-1;i++) {
			System.out.print(lotto[i] + ", ");
		}System.out.println(lotto[5]);
		
		for(int i=0;i<num.length;i++) {
			
			num[i] = false;
		}
	}
	
}
