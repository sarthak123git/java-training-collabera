package com.example.demo;

import java.util.List;

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
@RequestMapping("tags")
public class TagsController {
   @Autowired
    TagsImpl tagsImpl;
   @PostMapping("save")
   public Tags add(@RequestBody Tags tags)
   {
	  return tagsImpl.saveTags(tags);
   }
   @GetMapping("read")
   public List<Tags> read()
   {
	  return tagsImpl.gettingPost();
   }
   @PutMapping("update")
   public Tags update(@RequestBody Tags tags)
   {
	   return tagsImpl.updateTags(tags);
   }
   @DeleteMapping("delete{id}")
   public String delete(@PathVariable long id)
   {
	   return tagsImpl.deleteTags(id);
   }
}
