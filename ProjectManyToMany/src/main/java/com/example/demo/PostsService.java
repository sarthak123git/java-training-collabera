package com.example.demo;

import java.util.List;

public interface PostsService {
	
	public Posts savePost(Posts posts);
	public List<Posts> gettingPost();
	public Posts updatePost(Posts posts);
	public String deletePost(Long id);

}
