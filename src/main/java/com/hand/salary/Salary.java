package com.hand.salary;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("请输入工资:");
		        double salary = scanner.nextDouble();
		        double score = salary - 3500;
		        double tax = 0;
		        if (score<=0){
		            tax = 0;
		        }else if(score<=1500){
		            tax = score * 0.03;
		        }else if(score<=4500){
		            tax = score * 0.1;
		        }else if(score<=9000){
		            tax = score * 0.2;
		        }else if(score<=35000){
		            tax = score * 0.25;
		        }else if(score<=55000){
		            tax = score *0.3;
		        }else if(score<=80000){
		            tax = score * 0.35;
		        }else if(score>80000){
		            tax = score *0.45;
		        }
		        System.out.println("所需要缴纳的税费为："+tax);
		    }
		


	}


