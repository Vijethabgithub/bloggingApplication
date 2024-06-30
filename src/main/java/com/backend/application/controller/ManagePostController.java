package com.backend.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.application.constant.BloggingPlatformConstants;
import com.backend.application.dto.CommentDTO;
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
	 */
	@GetMapping("/posts")
	public ResponseEntity<?> getPost() {
		try {
			List<PostDTO> dto = managePostservice.getPosts();
			return new ResponseEntity<>(dto, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	/**
	 * Retrive a single blog post by its ID.
	 */
	@GetMapping("/posts/{postId}")
	public ResponseEntity<?> getPostById(@PathVariable("postId") String postId) {
		try {
			PostDTO dto = managePostservice.getPostById(postId);
			return new ResponseEntity<>(dto, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	/**
	 * Create a new blog Post.
	 */
	@PostMapping("/posts")
	public ResponseEntity<String> savePost(@RequestBody PostDTO postDTO) {
		try {
			managePostservice.savePost(postDTO);
			return new ResponseEntity<>(BloggingPlatformConstants.POST_SAVED_SUCCESSFULL, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

		}

	}

	/**
	 * Update an existing blog post by its ID.
	 */
	@PutMapping("/posts/{postId}")
	public ResponseEntity<String> updatePostById(@PathVariable("postId") String postId, @RequestBody PostDTO postDTO) {
		try {
			managePostservice.updatePostById(postId, postDTO);
			return new ResponseEntity<>(BloggingPlatformConstants.POST_UPDATED_SUCCESSFULL, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	/**
	 * Delete a blog post by its ID. 
	 */
	@DeleteMapping("/posts/{postId}")
	public ResponseEntity<String> deletePostById(@PathVariable("postId") String postId) {
		try{
			managePostservice.deletePostById(postId);
			return new ResponseEntity<>(BloggingPlatformConstants.POST_DELETED_SUCCESSFULL, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	/**
	 * Add Comment to a Specific blog post. 
	 */
	@PostMapping("/posts/comments/{postId}")
	public ResponseEntity<String> saveCommentByPostId(@PathVariable("postId") String postId, @RequestBody CommentDTO commentDTO) {
		try{
			managePostservice.saveCommentByPostId(postId, commentDTO);
			return new ResponseEntity<>(BloggingPlatformConstants.COMMENT_ADDED_SUCCESSFULL, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	/**
	 * Retrive all comments for a specific blog post.
	 */
	@GetMapping("/posts/comments/{postId}")
	public ResponseEntity<?> getCommentsByPostId(@PathVariable("postId") String postId) {
		try {
			List<CommentDTO> dto = managePostservice.getCommentsByPostId(postId);
			return new ResponseEntity<>(dto, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
}
