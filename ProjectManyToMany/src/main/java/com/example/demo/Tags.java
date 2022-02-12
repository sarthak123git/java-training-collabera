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
import javax.persistence.ManyToMany;

import org.springframework.web.bind.annotation.RequestMapping;

@Entity

public class Tags {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;
	    //private List<Posts> posts=new ArrayList<>();
	    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "tags")
	    private Set<Posts> posts= new HashSet<>();
		public Tags() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Tags(Long id, String name, Set<Posts> posts) {
			super();
			this.id = id;
			this.name = name;
			this.posts = posts;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Set<Posts> getPosts() {
			return posts;
		}
		public void setPosts(Set<Posts> posts) {
			this.posts = posts;
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, name, posts);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tags other = (Tags) obj;
			return Objects.equals(id, other.id) && Objects.equals(name, other.name)
					&& Objects.equals(posts, other.posts);
		}
		@Override
		public String toString() {
			return "Tags [id=" + id + ", name=" + name + ", posts=" + posts + "]";
		}
	    
	    
}
