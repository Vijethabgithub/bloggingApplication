package com.backend.application.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.application.dto.CommentDTO;
import com.backend.application.dto.PostDTO;
import com.backend.application.entity.Comment;
import com.backend.application.entity.Post;
import com.backend.application.mapper.PostMapper;
import com.backend.application.repository.CommentRepository;
import com.backend.application.repository.PostRespository;
import com.backend.application.service.ManagePostService;

/**
 * 
 * @author vijetha
 *
 */
@Service
public class ManagePostServiceImpl implements ManagePostService {

	@Autowired
	private PostRespository postRepository;

	@Autowired
	private PostMapper postMapper;

	@Autowired
	private CommentRepository commentRepository;

	@Override
	public List<PostDTO> getPosts() {

		List<Post> posts = postRepository.findAll();
	return postMapper.convertEntityListtoDTO(posts);
		 

	}

	@Override
	public void savePost(PostDTO postDTO) {
		Post post = postMapper.convertDTOtoEntity(postDTO);
		postRepository.save(post);
	}

	@Override
	public void deletePostById(String postId) {
		commentRepository.deleteByPostId(postId);
		postRepository.deleteById(postId);

	}

	@Override
	public PostDTO getPostById(String postId) {

		PostDTO postDTO = null;
		Post post = postRepository.findById(postId).orElse(null);
		if (post != null) {
			postDTO = postMapper.convertEntitytoDTO(post);
		}
		return postDTO;

	}

	@Override
	public void updatePostById(String postId, PostDTO postDTO) {
		Post post = postRepository.findById(postId).orElse(null);
		if (post != null) {
			post.setAuthor(postDTO.getAuthor());
			post.setBody(postDTO.getBody());
			post.setTitle(postDTO.getTitle());
			postRepository.save(post);

		}

	}

	@Override
	public void saveCommentByPostId(String postId, CommentDTO commentDTO) {
		commentDTO.setPostId(postId);
		Comment comment = postMapper.convertCommentDTOtoEntity(commentDTO);
		commentRepository.save(comment);

	}

	@Override
	public List<CommentDTO> getCommentsByPostId(String postId) {
		List<Comment> comment = commentRepository.findByPostId(postId);
		 List<CommentDTO>commentDTO = postMapper.convertCommentEntityToDTO(comment);
	 return commentDTO;
	}
	

}
