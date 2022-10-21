public class Test18{

	public static void main(String[] args) {
	
    int sum = 1;
	int q = 5;

	for (int i =0;i<q+1;i++){
		if(i!=q)System.out.print("*");
		if(i==q-1||i==q){
		q--;
			for(int j = 1;j<sum+1;j++){
			System.out.print(j);
		}   
			sum++;
			i = -1;
			System.out.print("\n");
		}
		}
	}
}
