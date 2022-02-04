/**
 * 
 */
package com.dsclearning.jwt.demo.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author duchauha
 *
 */

@Service
public class UserService  implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	   
		// Logic to get the user from the db based on username
		
		return new User("admin","admin",new ArrayList<>());
	}

}
