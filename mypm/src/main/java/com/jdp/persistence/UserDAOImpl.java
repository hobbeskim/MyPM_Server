package com.jdp.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jdp.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO{

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace= "com.jdp.mapper.UserMapper";
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertUser(UserVO user) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertUser", user);
	}
	
}
