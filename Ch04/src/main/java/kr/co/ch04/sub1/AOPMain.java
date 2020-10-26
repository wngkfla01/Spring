package kr.co.ch04.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/09/01
 * �̸� : ���ϸ�
 * ���� : AOP �ǽ��ϱ�
 * 	
 *  ������ AOP
 *   - �ٽɰ��ɰ� �������(Ⱦ�ܰ���)�� �и��ؼ� ���α׷��� �ϴ� ���
 *   
 *  �ֿ���
 *   1) JoinPoint
 *    - �����ϴ� ��� �ٽɰ��� �޼���(��� Pointcut)
 *    
 *   2) Pointcut
 *    - ��������Ʈ ��� AOP�� ������ �ٽɰ��� �޼��� 
 *    
 *   3) Advice
 *    - Ⱦ�ܰ��ɿ� �ش��ϴ� ������ �ΰ���� �޼��� 
 *    
 *   4) Aspect
 *    - ����Ʈ�ư� �����̽��� ���յ� �������
 *   
 *   5) Weaving
 *    - ����Ʈ��(�ٽɰ���)�� ����ɶ� �����̽��� ����Ʈ�ƿ� ���յǴ� ����
 */
public class AOPMain {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		bs.insert();
		bs.select();
		bs.update(1);
		bs.delete(1, "abcd");
	}	
}
