package kr.co.ch05.advice;

import org.springframework.stereotype.Component;

@Component
public class AfterThrowAdvice {
	public void afterThrow1() {
		System.out.println("Ⱦ�ܰ��� - afterThrow1...");
	}
	
	public void afterThrow2() {
		System.out.println("Ⱦ�ܰ��� - afterThrow2...");
	}
	
	public void afterThrow3() {
		System.out.println("Ⱦ�ܰ��� - afterThrow3...");
	}
}
