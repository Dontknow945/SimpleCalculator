package a1.calculator;

import java.util.Scanner;

public class calculator 
{
	public static void main(String[] arg){
		double num1=0 ,num2=0;
		String str1;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("�ثe�`�M��: "+num2);
			System.out.println("�п�J�����椧�ާ@(+,-,*,/,exit): ");
			str1=sc.next();
			
			if(str1.equals("+")){			//checking whether the operator is "+,-,*,/,exit"
				System.out.println("�п�J�P�`�M�i��ާ@���ƭ�: ");
				num1=sc.nextDouble();
				num2+=num1;
			}else if(str1.equals("-")){
				System.out.println("�п�J�P�`�M�i��ާ@���ƭ�: ");
				num1=sc.nextDouble();
				num2-=num1;
			}else if(str1.equals("*")){
				System.out.println("�п�J�P�`�M�i��ާ@���ƭ�: ");
				num1=sc.nextDouble();
				num2*=num1;
			}else if(str1.equals("/")){
				System.out.println("�п�J�P�`�M�i��ާ@���ƭ�: ");
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
