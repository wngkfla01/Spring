package kr.co.ch04.sub1;

import org.springframework.stereotype.Service;

@Service
public class LogAdvice {

	public void beforeLog() {
		System.out.println("=====================");
		System.out.println("Ⱦ�ܰ��� - beforeLog...");
	}
	
	public void afterLog() {
		System.out.println("Ⱦ�ܰ��� - afterLog...");
		System.out.println("---------------------");
	}	
}
