import java.io.*;
 public class Java35{
 public static void main(String[]args)throws IOException{
 BufferedReader br=
 new BufferedReader(new InputStreamReader(System.in));
 System.out.print("���l�P����͂��Ă��������B�F");
int a=Integer.parseInt(br.readLine());
 System.out.print("���l�Q����͂��Ă��������B�F");
int b=Integer.parseInt(br.readLine());
 System.out.print("���Z�q����͂��Ă��������B�F");
String c=br.readLine();

 System.out.print("�v�Z���ʂ́A"); 
if( c.equals("+") )

 System.out.print(a+b);
 }else{
 System.out.print("0"); 
 }
 System.out.println("�ł��B");
 }
 }