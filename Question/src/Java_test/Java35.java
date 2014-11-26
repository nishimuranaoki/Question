import java.io.*;
 public class Java35{
 public static void main(String[]args)throws IOException{
 BufferedReader br=
 new BufferedReader(new InputStreamReader(System.in));
 System.out.print("数値１を入力してください。：");
int a=Integer.parseInt(br.readLine());
 System.out.print("数値２を入力してください。：");
int b=Integer.parseInt(br.readLine());
 System.out.print("演算子を入力してください。：");
String c=br.readLine();

 System.out.print("計算結果は、"); 
if( c.equals("+") )

 System.out.print(a+b);
 }else{
 System.out.print("0"); 
 }
 System.out.println("です。");
 }
 }