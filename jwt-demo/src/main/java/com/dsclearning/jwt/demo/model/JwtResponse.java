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
public class JwtResponse {
	
	private String jwtToken;

}
