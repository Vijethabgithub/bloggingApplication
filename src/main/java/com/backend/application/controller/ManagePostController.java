package com.backend.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.application.dto.PostDTO;
import com.backend.application.entity.Post;
import com.backend.application.service.ManagePostService;

/**
 * 
 * @author vijetha
 *
 */
@RestController
public class ManagePostController {

	@Autowired
	private ManagePostService managePostservice;

	/**
	 * Retrive a list of all blog posts.
	 * 
	 * @return
	 */
	@GetMapping("/posts")
	public List<PostDTO> getPost() {

		return managePostservice.getPosts();
	}

	/**
	 * Retrive a single blog post by its ID.
	 * 
	 * @return
	 */
	@GetMapping("/posts/{postId}")
	public PostDTO getPostById(@PathVariable("postId") String postId) {
		return managePostservice.getPostById(postId);

	}

	/**
	 * Create a new blog Post.
	 */
	@PostMapping("/posts")
	public void savePost(@RequestBody PostDTO postDTO) {

		managePostservice.savePost(postDTO);
	}

	/**
	 * Update an existing blog post by its ID.
	 */
	@PutMapping("/posts/{postId}")
	public void updatePostById(@PathVariable("postId") String postId, @RequestBody PostDTO postDTO) {

	}

	/**
	 * Delete a blog post by its ID.
	 */
	@DeleteMapping("/posts/{postId}")
	public void deletePostById(@PathVariable("postId") String postId) {
		managePostservice.deletePostById(postId);

	}

	/**
	 * Add Comment to a Specific blog post.
	 */
	@PostMapping("/posts/{postId}/{comments}")
	public void saveCommentByPostId(@PathVariable("postId") String postId, @PathVariable("comments") String comments) {

	}

	/**
	 * Retrive all comments for a specific blog post.
	 */
	@GetMapping("/posts/comments/{postId}")
	public void getCommentsByPostId(@PathVariable("postId") String postId) {

	}
}
