package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("posts")
public class PostController {
	@Autowired
	PostImpl postImpl;
	@PostMapping("save")
	public void  add(@RequestBody Posts posts)
	{
		   postImpl.savePost(posts);
	}
	
	@GetMapping("read")
	public void findaLL()
	{
		postImpl.gettingPost();
	}
	@PutMapping("update")
	
	public void update(@RequestBody Posts posts)
	{
		postImpl.updatePost(posts);
	}
	
	@DeleteMapping("delete")
	public void delete(@PathVariable long id)
	{
		postImpl.deletePost(id);
	}
	

}
