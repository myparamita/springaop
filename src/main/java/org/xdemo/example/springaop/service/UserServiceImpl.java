package org.xdemo.example.springaop.service;

import org.springframework.stereotype.Service;
import org.xdemo.example.springaop.annotation.Log;
import org.xdemo.example.springaop.bean.User;

@Service
public class UserServiceImpl implements IUserService {

	@Log(name="您访问了保存用户信息")
	public void save(User user) {
		System.out.println(user.getName());
	}
	
}
