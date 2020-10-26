package kr.co.ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/08/31
 * �̸� : ���ϸ�
 * ���� : ������ Ioc �ǽ��ϱ�
 */
public class IoCTest {
	
	public static void main(String[] args) {
		
		// Ioc�� ������ ���
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
				
		
		TV lgTV      = (TV) ctx.getBean("lgTV");
		TV samsungTV = (TV) ctx.getBean("samsungTV");
		
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
	}
}











