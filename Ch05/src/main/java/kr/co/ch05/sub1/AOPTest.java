package kr.co.ch05.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/09/02
 * �̸� : ���ϸ�
 * ���� : ������̼� ��� AOP �ǽ��ϱ�
 */
public class AOPTest {
	
	public static void main(String[] args) {
	
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		System.out.println("==========================");
		bs.insert();
		System.out.println("==========================");
		bs.select();
		System.out.println("==========================");
		bs.update(1);
		System.out.println("==========================");
		bs.delete(1, "abcd");
		
	}
}
