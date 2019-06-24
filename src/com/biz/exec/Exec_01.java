package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_01 {
	public static void main(String[] args) {
		
		// AddService에 선언된
		// add(int num1 , int num2) method를 사용하기 위한 준비작업
		AddService as = new AddService();
		
		as.add(30, 40);
		as.add(100, 200);
		
		int sum = as.add(200, 300);
		System.out.println(sum);
		
		System.out.println(as.add(1000, 2000));
		as.add();
		
		//add(num1,num2,num3) method는 타입이 void형이기때문에 변수에 값을 대입하는 문장을 사용할 수 없다.
//		sum = as.add(100, 200, 300);
		
	}
}
