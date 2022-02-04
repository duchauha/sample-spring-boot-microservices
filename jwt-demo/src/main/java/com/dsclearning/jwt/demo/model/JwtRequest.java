/**
 * 
 */
package com.dsclearning.jwt.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author duchauha
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest {
	
	private String userName;
	private String password;

}
