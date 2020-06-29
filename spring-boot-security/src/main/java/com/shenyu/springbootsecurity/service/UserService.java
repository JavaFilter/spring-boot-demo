package com.shenyu.springbootsecurity.service;

import com.shenyu.springbootsecurity.model.User;

import java.util.Set;


public interface UserService {

	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	User findByUsername(String username);

    /**
     * 查找用户菜单按钮
     * @param username
     * @return
     */
	Set<String> findPermissions(String username);

}
