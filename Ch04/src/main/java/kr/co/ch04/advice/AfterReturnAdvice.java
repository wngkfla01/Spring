package kr.co.ch04.advice;

import org.springframework.stereotype.Component;

@Component
public class AfterReturnAdvice {

	public void afterReturn1() {
		System.out.println("Ⱦ�ܰ��� - afterReturn1...");
	}
	
	public void afterReturn2() {
		System.out.println("Ⱦ�ܰ��� - afterReturn2...");
	}
	
	public void afterReturn3() {
		System.out.println("Ⱦ�ܰ��� - afterReturn3...");
	}
	
}
