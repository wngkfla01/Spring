package kr.co.ch05.sub1;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	public void insert() {
		System.out.println("�ٽɰ��� - insert...");
	}
	
	public void select() {
		System.out.println("�ٽɰ��� - select...");
	}
	
	public void update(int seq) {
		System.out.println("�ٽɰ��� - update...");
	}
	
	public void delete(int seq, String uid) {
		System.out.println("�ٽɰ��� - delete...");
	}	
}
