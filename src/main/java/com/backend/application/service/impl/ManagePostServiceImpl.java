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
		return postMapper.convertEntitytoDTO(posts);
	}

	@Override
	public void savePost(PostDTO postDTO) {
		Post post = postMapper.convertDTOtoEntity(postDTO);
		postRepository.save(post);
	}

}
