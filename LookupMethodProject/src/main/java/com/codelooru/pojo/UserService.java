package com.codelooru.pojo;

public abstract class UserService {

	/**
	 * Initialize a new User instance and return it (always a new instance).
	 * @return
	 */
	public abstract User getInitializedUserInstance();
	
	/**
	 * Return the default Operations User (singleton)
	 * @return
	 */
	public abstract User getOperationsUser();

}
