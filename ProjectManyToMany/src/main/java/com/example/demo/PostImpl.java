package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostImpl implements PostsService {
   @Autowired
    PostRepo postRepo;
	@Override
	public Posts savePost(Posts posts) {
		return postRepo.save(posts);
		
	}

	@Override
	public List<Posts> gettingPost() {
		
		return postRepo.findAll();
	}

	@Override
	public Posts updatePost(Posts posts) {
		 
		return postRepo.save(posts);
	}

	@Override
	public String deletePost(Long id) {
		postRepo.deleteById(id);
		return null;
	}
  

}
