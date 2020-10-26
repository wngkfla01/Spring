package kr.co.ch02.sub3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/08/31
 * �̸� : ���ϸ�
 * ���� : DI Setter�� �̿��� ������ Ioc ����
 */
public class IoCTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
				
		
		TV lgTV      = (TV) ctx.getBean("sub3LgTV");
		TV samsungTV = (TV) ctx.getBean("sub3SamsungTV");
		
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
	}
}











