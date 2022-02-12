package com.example.demo;

import java.util.List;

public interface TagsServices 
{
	public Tags saveTags(Tags tags);
	public List<Tags> gettingPost();
	public Tags updateTags(Tags tags);
	public String deleteTags(Long id);
}
