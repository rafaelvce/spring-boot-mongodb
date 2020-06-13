package com.rafaelvce.springbootmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelvce.springbootmongo.domain.User;
import com.rafaelvce.springbootmongo.respositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;	
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
