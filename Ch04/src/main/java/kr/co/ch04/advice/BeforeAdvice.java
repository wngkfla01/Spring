package kr.co.ch04.advice;

import org.springframework.stereotype.Component;

@Component
public class BeforeAdvice {
	
	public void before1() {		
		System.out.println("Ⱦ�ܰ��� - before1...");
	}
	
	public void before2() {
		System.out.println("Ⱦ�ܰ��� - before2...");
	}
	
	public void before3() {
		System.out.println("Ⱦ�ܰ��� - before3...");
	}
}
