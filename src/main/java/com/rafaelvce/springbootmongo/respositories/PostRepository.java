package com.rafaelvce.springbootmongo.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafaelvce.springbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
