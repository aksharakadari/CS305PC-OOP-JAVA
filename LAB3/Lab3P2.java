import java.util.Scanner;
class Lab3P2{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		for(i=2;i<n;i++){
			int j,count=0;
			if(i==2)
				count++;
			for(j=2;j<i;j++){		
				if(i%j==0){
					count=0;
					break;
				}
				else
					count++;
			}
			if(count>0)
				System.out.println(i);
			
		}
       }
}