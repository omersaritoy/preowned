package com.cavcav.service;

import com.cavcav.domain.*;
import com.cavcav.exception.*;
import com.cavcav.model.*;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
