package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_02 {
	public static void main(String[] args) {

		AddService as = new AddService();

		for (int i = 0; i < 10; i++) {
			as.add();
		}

		// i 값이 0부터 9까지 1씩 증가 되면서
		// add(num1,num2) method에 보내서
		// num2에 담기게 된다.
		for (int i = 0; i < 10; i++) {
			as.add(3, i);
		}

		/*
		 * 4+0 ~ 4+9 까지 덧셈을 하도록 add(num1,num2) method를 호출하고 return한 값을 sum변수에 누적시키고
		 */
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += as.add(4, i);

		}
		// sum 변수값을 콘솔에 보이기
		System.out.println("sum : " + sum);

	}
}
