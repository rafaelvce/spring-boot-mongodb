package com.rafaelvce.springbootmongo.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafaelvce.springbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
