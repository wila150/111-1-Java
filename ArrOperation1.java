public class ArrOperation1 {
	public static void main(String[] args){
		
		int myArr[] ={7,5,4,9,8,1,2};
		int[] flag={0,0,0,0,0,0,0};
		int [] flag_arr = new int[myArr.length];
		int flag_count = 1;
		
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		max = min = myArr[0];
			for(int i = 0 ;i<myArr.length; i++){
				if(myArr[i]>max){
					max = myArr[i];
				}
				if(myArr[i]<min){
					min = myArr[i];
					
				}
				
				sum = sum + myArr[i];
			}
	//find med ------------------------------------
		int med = 0;
		for (int i =0 ; i<4;i++){
			int flag_min = 1000;
			int flag_min_index = 0;
			for(int j = 0; j<myArr.length;j++){
				if(myArr[j] < flag_min && flag[j] == 0){
					flag_min = myArr[j];
					flag_min_index = j ;
						
				}
			}
				flag[flag_min_index] = flag_count;
				flag_count++;
				med = myArr[flag_min_index];
					
			}
	//			------------------------------------	
				System.out.println("Max:"+max);
				System.out.println("Min:"+min);
				System.out.println("AVG:"+sum * 1.0 / myArr.length);
				System.out.println("Med:"+med);
			
	}
}