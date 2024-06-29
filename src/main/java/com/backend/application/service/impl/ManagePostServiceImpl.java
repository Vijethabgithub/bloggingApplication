package com.backend.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.application.dto.PostDTO;
import com.backend.application.entity.Post;
import com.backend.application.mapper.PostMapper;
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
		postRepository.deleteById(postId);

	}

	@Override
	public PostDTO getPostById(String postId) {
		
	PostDTO	postDTO = null;
	Post post = postRepository.findById(postId).orElse(null);
	if(post!=null) {
		postDTO = postMapper.convertEntitytoDTO(post);
	}
	return postDTO;	
		
	}

}
