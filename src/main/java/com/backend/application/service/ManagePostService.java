package com.backend.application.service;

import java.util.List;

import com.backend.application.dto.CommentDTO;
import com.backend.application.dto.PostDTO;

/**
 * 
 * @author vijetha
 *
 */
public interface ManagePostService {

	List<PostDTO> getPosts();

	void savePost(PostDTO postDTO);

	void deletePostById(String postId);

	PostDTO getPostById(String postId);

	void updatePostById(String postId, PostDTO postDTO);

	void saveCommentByPostId(String postId, CommentDTO commentDTO);

	List<CommentDTO> getCommentsByPostId(String postId);

}
