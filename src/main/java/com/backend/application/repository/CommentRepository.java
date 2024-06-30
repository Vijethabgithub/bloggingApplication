package com.backend.application.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backend.application.entity.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {

	List<Comment> findByPostId(String postId);

	void deleteByPostId(String postId);

}
