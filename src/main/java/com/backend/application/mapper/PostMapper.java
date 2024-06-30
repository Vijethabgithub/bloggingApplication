package com.backend.application.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.backend.application.dto.CommentDTO;
import com.backend.application.dto.PostDTO;
import com.backend.application.entity.Comment;
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

	public Comment convertCommentDTOtoEntity(CommentDTO commentDTO) {
		Comment comment = new Comment();
		comment.setAuthor(commentDTO.getAuthor());
		comment.setBody(commentDTO.getBody());
		comment.setPostId(commentDTO.getPostId());

		return comment;

	}

	public List<CommentDTO> convertCommentEntityToDTO(List<Comment> comments) {
		List<CommentDTO> dtos = new ArrayList<CommentDTO>();
		for (Comment comment : comments) {
			CommentDTO commentDTO = new CommentDTO();
			commentDTO.setAuthor(comment.getAuthor());
			commentDTO.setBody(comment.getBody());
			commentDTO.setId(comment.getId());
			commentDTO.setPostId(comment.getPostId());
			commentDTO.setTimestamp(comment.getTimestamp());
			dtos.add(commentDTO);
		}

		return dtos;
	}

}
