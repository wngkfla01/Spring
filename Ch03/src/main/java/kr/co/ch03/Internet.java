package kr.co.ch03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Internet {	
	public void access() {
		System.out.println("인터넷 연결...");
	}
}
