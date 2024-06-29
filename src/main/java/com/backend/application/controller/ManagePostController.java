package com.backend.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.application.dto.PostDTO;
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

	@GetMapping("/posts")
	public void getPost() {

	}

	@GetMapping("/posts/{postId}")
	public void getPostById(@PathVariable("postId") String postId) {

	}

	@PostMapping("/posts")
	public void savePost(@RequestBody PostDTO postDTO) {

	}

	@PutMapping("/posts/{postId}")
	public void updatePostById(@PathVariable("postId") String postId, @RequestBody PostDTO postDTO) {

	}

	@DeleteMapping("/posts/{postId}")
	public void deletePostById(@PathVariable("postId") String postId) {

	}

	@PostMapping("/posts/{postId}/{comments}")
	public void saveCommentByPostId(@PathVariable("postId") String postId, @PathVariable("comments") String comments) {

	}

	@GetMapping("/posts/comments/{postId}")
	public void getCommentsByPostId(@PathVariable("postId") String postId) {

	}
}
