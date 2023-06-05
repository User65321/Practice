package com.example.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tip")
public class Tip {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy =	GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="overview")
	private String overview;

	@Column(name="content")
	private String content;
	
//	@Column(name="url")
//	private String url;

	
	
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
	
	public void Overview(String overview) {
		this.overview = overview;
		}
	
	public String getContent() {
		return content;
		}
	
	public void Content(String content) {
		this.content = content;
		}
		
//	public String getUrl() {
//		return url;
//		}
//	
//	public void setUrl(String url) {
//		this.url = url;
//		}

}
