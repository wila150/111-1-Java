public class ArrInverse2 {
	public static void main(String[] args){
	
	int[] myArr ={7,5,4,8,1,2};
	int temp;
		for(int i = 0; i<myArr.length/2; i++){
			temp = myArr[i];
			myArr[i] = myArr[myArr.length-1-i];
			myArr[myArr.length-1-i]= temp;
		}
			
		for(int i = 0; i < myArr.length;i++){
			System.out.println(myArr[i]);
		
		}
		
	
	}
}