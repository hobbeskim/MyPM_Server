package com.jdp.persistence;

import com.jdp.domain.UserVO;

public interface UserDAO {
	public String getTime();
	public void insertUser(UserVO user);
}
