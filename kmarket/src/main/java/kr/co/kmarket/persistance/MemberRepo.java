package kr.co.kmarket.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.MemberVo;

@Repository
public interface MemberRepo extends JpaRepository<MemberVo, String>{

}
