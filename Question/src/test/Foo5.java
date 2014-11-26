public class Foo5  {
	public static void main(String [] args){
		go(8);
	}
	static final int x = 12; 

	public static void go(final int x){
		System.out.println(x);
		System.out.println(Foo5.x);
	}
}