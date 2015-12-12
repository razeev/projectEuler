package project1;

import java.util.List;
import java.util.Arrays;

public class Multiple3and5 {

	public static void main(String[] args) {
		
		List<Integer> just_loop = Arrays.asList(3,5);
		int max=1000;
		int sum=0;
		int sum_15=0;
		//individual sums
		for(Integer i :just_loop){
			for(int j=1;j<max;j++){
				int num = i*j;
				if(num>=max){
					break;
				}
				else{
					sum+=num;
				}
				
			}
		}
		
		//minus together
		for(int k=1;k<max;k++){
			int num=k*15;
			if(num>=max)break;
			sum_15+=num;
		}
		System.out.println(sum-sum_15);

	}

}
