package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.User;

public interface UserService {

	/**
	 * 
	 * @param username
	 * @param password
	 * @return �û���¼�ɹ��������û����󣬷��򷵻ؿ�
	 */
	User login(String username, String password);
	User getUserByUsername(String username);
}
