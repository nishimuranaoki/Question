import java.io.*;
	class Java33
	{
		public static void main(String[] args)  throws IOException {
		System.out.println("数を入力してください");
		String a;
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		a = br.readLine();
		System.out.println(a);
		}
	}