/**
 * 
 */
package com.hcl.security.jwt.models;

import java.io.Serializable;

/**
 * @author Abhi Kanchan
 *
 */
public class AuthenticationResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

}
