package com.jdp.mypm;

import javax.inject.Inject;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jdp.domain.ProductVO;
import com.jdp.domain.UserVO;
import com.jdp.persistence.UserDAO;

@Controller
public class SampleController {

	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(SampleController.class);
	
	@Inject
	private UserDAO dao;
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		logger.info("doJSON........");
		ProductVO vo = new ProductVO("sample", 30000);
		System.out.println(vo);
		return vo;
	}
	
	@RequestMapping("/insUser")
	public void insUser() {
		logger.info("insUser........");
		UserVO user = new UserVO();
		user.setUid("Dongho");
		user.setUpw("1234");
		user.setUname("JiEun");
		user.setUemail("DHheartJE@DJ.com");
		
		dao.insertUser(user);
	}
	
}
