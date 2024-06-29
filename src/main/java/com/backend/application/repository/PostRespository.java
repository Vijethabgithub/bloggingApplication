package com.backend.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.backend.application.entity.Post;

@Repository
public interface PostRespository extends MongoRepository<Post, String> {

}
