public class Test15{
    public static void main (String[] avgs){//輸入
        int row=0,blank=4,star=0,col;
        for(row=0;row<=9;row++){
                
            for(col=0;col<blank;col++){
                    System.out.print(" ");                        
            }
        for(col=0;col<=star;col++){
            System.out.print("*");
        }
        System.out.println("");
        if(row<4){
            blank--;
            star+=2;
        }
        else{
            blank++;
            star-=2;
        }
		
       }
    }
}