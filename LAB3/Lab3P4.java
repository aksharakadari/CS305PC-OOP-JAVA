import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		String b=s.next();
		Lab3P4 l=new Lab3P4();
		l.show();l.show(a);l.show(b);l.show(a,b);
		s.close();
	}
	public void show(){
		System.out.println("Method without params");
	}
	public void show(int x){
		System.out.println("Method with params:"+x);
	}
	public void show( String s){
		System.out.println("Method with string params:"+s);
	}
 
		System.out.println("Method with two  params int and string:"+x+" "+s);
	}
}