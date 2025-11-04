package com.elitech.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.elitech.entities.UserInfo;

public class UserInfoDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName=null;
	String password=null;
	List<GrantedAuthority> authorities;
	
	

	public UserInfoDetails(UserInfo userInfo) {
		super();
		this.userName = userInfo.getEmail();
		this.password = userInfo.getPassword();
		this.authorities = userInfo.getRoles().stream().map(role-> new SimpleGrantedAuthority(role.getName()))
				.collect(Collectors.toList());
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}
	

}
