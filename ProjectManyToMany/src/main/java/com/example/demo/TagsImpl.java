package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TagsImpl implements TagsServices {
  @Autowired
    TagsRepo tagsRepo;
	@Override
	public Tags saveTags(Tags tags) {
		
		return tagsRepo.save(tags);
	}

	@Override
	public List<Tags> gettingPost() {
		
		return tagsRepo.findAll();
	}

	@Override
	public Tags updateTags(Tags tags) {
		
		return tagsRepo.save(tags);
	}

	@Override
	public String deleteTags(Long id) {
		tagsRepo.deleteById(id);
		return "Done";
	}

}
