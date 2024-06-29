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
		post.setTitle(postDTO.getTitle());

		return post;

	}

	public List<PostDTO> convertEntityListtoDTO(List<Post> posts) {

		List<PostDTO> dtos = new ArrayList<PostDTO>();

		for (Post post : posts) {

			PostDTO postDTO = new PostDTO();
			postDTO.setId(post.getId());
			postDTO.setAuthor(post.getAuthor());
			postDTO.setBody(post.getBody());
			postDTO.setTitle(post.getTitle());
			postDTO.setTimestamp(post.getTimestamp());
			dtos.add(postDTO);

		}

		return dtos;
	}

	public PostDTO convertEntitytoDTO(Post post) {

		PostDTO postDTO = new PostDTO();
		postDTO.setId(post.getId());
		postDTO.setAuthor(post.getAuthor());
		postDTO.setBody(post.getBody());
		postDTO.setTitle(post.getTitle());
		postDTO.setTimestamp(post.getTimestamp());

		return postDTO;

	}

}
