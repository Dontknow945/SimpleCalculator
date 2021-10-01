package a1.calculator;

import java.util.Scanner;

public class calculator 
{
	public static void main(String[] arg){
		double num1=0 ,num2=0;
		String str1;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("目前總和為: "+num2);
			System.out.println("請輸入欲執行之操作(+,-,*,/,exit): ");
			str1=sc.next();
			
			if(str1.equals("+")){			//checking whether the operator is "+,-,*,/,exit"
				System.out.println("請輸入與總和進行操作之數值: ");
				num1=sc.nextDouble();
				num2+=num1;
			}else if(str1.equals("-")){
				System.out.println("請輸入與總和進行操作之數值: ");
				num1=sc.nextDouble();
				num2-=num1;
			}else if(str1.equals("*")){
				System.out.println("請輸入與總和進行操作之數值: ");
				num1=sc.nextDouble();
				num2*=num1;
			}else if(str1.equals("/")){
				System.out.println("請輸入與總和進行操作之數值: ");
				num1=sc.nextDouble();
				if(num1!=0){			//make sure that divisor doesn't equal to 0
					num2/=num1;
				}else{
					System.out.println("error!");
				}
			}else if(str1.equals("exit")){
				sc.close();
				System.out.println("Bye!");
				break;
			}else{
				System.out.println("error!");
			}
		}
	}
}
