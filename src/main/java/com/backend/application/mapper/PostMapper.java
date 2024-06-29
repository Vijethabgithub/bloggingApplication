package com.backend.application.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.backend.application.dto.PostDTO;
import com.backend.application.entity.Post;

@Component
public class PostMapper {

	public Post convertDTOtoEntity(PostDTO postDTO) {
    
		Post post = new Post();
		post.setAuthor(postDTO.getAuthor());
		post.setBody(postDTO.getBody());
		post.setTimestamp(postDTO.getTimestamp());
		post.setTitle(postDTO.getTitle());
		
		return post;
	
	}

	public List<PostDTO> convertEntitytoDTO(List<Post> posts) {

		List<PostDTO> dtos = new ArrayList<PostDTO>();

		for (Post post : posts) {

			PostDTO postDTO = new PostDTO();
			postDTO.setAuthor(post.getAuthor());
			postDTO.setBody(post.getBody());
			postDTO.setTimestamp(post.getTimestamp());
			postDTO.setTitle(post.getTitle());

			dtos.add(postDTO);

		}

		return dtos;
	}
}
