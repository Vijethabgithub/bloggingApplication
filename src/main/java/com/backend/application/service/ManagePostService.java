package com.backend.application.service;

import java.util.List;

import com.backend.application.dto.PostDTO;

/**
 * 
 * @author vijetha
 *
 */
public interface ManagePostService {

	List<PostDTO> getPosts();

	void savePost(PostDTO postDTO);

}
