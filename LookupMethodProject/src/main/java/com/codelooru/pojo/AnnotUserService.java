package com.codelooru.pojo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("anntUserService")
public abstract class AnnotUserService {

	/**
	 * Initialize a new User instance and return it (always a new instance).
	 * @return
	 */
	@Lookup(value="anntInitUserBean")
	public abstract AnnotUser getInitializedUserInstance();
	
}
