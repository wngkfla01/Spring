package kr.co.ch12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch12.persistence.UserRepo;
import kr.co.ch12.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public void insertUser(UserVo vo) {
		// insert into USER3 values (?,?,?,?) 수행
		repo.save(vo);
	}
	
	public UserVo selectUser(String uid) {
		// select * from USER3 where uid=? 수행
		return repo.findById(uid).get();
	}
	
	public List<UserVo> selectUsers() {
		// select * from USER3; 수행
		return repo.findAll();
	}
	

	public List<UserVo> selectUsersOrderBy(String sort) {
		
		List<UserVo> users = null;
		
		if(sort.equals("asc")) {
			users = repo.findUserVoByOrderByAgeAsc();
		}else {
			users = repo.findUserVoByOrderByAgeDesc();
		}
		
		return users;
	}
	
	public void updateUser(UserVo vo) {
		// update USER3 set name=?, hp=?, age=? where uid=? 수행
		repo.save(vo);
	}
	
	public void deleteUser(String uid) {
		// delete from USER3 where uid=? 수행
		repo.deleteById(uid);
	}
	
}
