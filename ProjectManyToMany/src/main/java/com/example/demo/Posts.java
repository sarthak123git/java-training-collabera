package com.example.demo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class Posts {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, description;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   @JoinTable(name="tags_posts",joinColumns = {@JoinColumn(name="posts_id")},inverseJoinColumns= {
           @JoinColumn(name="tags_id")   // column to connect with posts
           } )
            
    private Set<Tags> tags=new HashSet<>();
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Posts(Long id, String title, String description, Set<Tags> tags) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tags = tags;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, id, tags, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posts other = (Posts) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(tags, other.tags) && Objects.equals(title, other.title);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Tags> getTags() {
		return tags;
	}
	public void setTags(Set<Tags> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Posts [id=" + id + ", title=" + title + ", description=" + description + ", tags=" + tags + "]";
	}
	
    
    
}
