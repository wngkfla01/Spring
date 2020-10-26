package kr.co.ch04.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/09/01
 * �̸� : ���ϸ�
 * ���� : AOP Advice ���۽��� �ǽ��ϱ� 
 */
public class AdviceTest {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("bs2");
		
		System.out.println("===================");
		bs.insert();
		System.out.println("-------------------");
		
		System.out.println("===================");		
		bs.select();
		System.out.println("-------------------");
		
		System.out.println("===================");
		bs.update(1);
		System.out.println("-------------------");
		
		System.out.println("===================");		
		bs.delete(1, "abcd");
		System.out.println("-------------------");
		
		
	}
}
