package kr.co.ch04.advice;

import org.springframework.stereotype.Component;

@Component
public class AfterAdvice {

	public void after1() {
		System.out.println("Ⱦ�ܰ��� - after1...");
	}
	
	public void after2() {
		System.out.println("Ⱦ�ܰ��� - after2...");
	}
	
	public void after3() {
		System.out.println("Ⱦ�ܰ��� - after3...");
	}
}
