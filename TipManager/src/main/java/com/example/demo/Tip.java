package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipboxes")
public class Tip {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="title")
	private String title;
	
	@Column(name="overview")
	private String overview;

	@Column(name="content")
	private String content;
	
	@Column(name="url")
	private String url;
	
	@Column(name="comment")
	private String comment;

	public long getId() {
		return id;
		}
	 
	public void setId(long id) {
		this.id=id;
		}
	
	public String getTitle() {
		return title;
		}
	
	public void setTitle(String title) {
		this.title = title;
		}
	
	
	public String getOverview() {
		return overview;
		}
	
	public void setOverview(String overview) {
		this.overview= overview;
		}
	
	
	public String getContent() {
		return content;
		}
	
	public void setContent(String content){
		this.content= content;
		}

	public String getUrl() {
		return url;
		}
	
	public void setUrl(String url){
		this.url= url;
		}

	public String getComment() {
		return comment;
		}
	
	public void setComment(String comment) {
		this.comment = comment;
		}
	
}
