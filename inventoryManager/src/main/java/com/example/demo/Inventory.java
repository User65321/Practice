package com.example.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy =	GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="book")
//	@NotNull(message="書籍名を入力してください")
	private String book;
	
	@Column(name="price")
//	@NotNull(message="価格を入力してください")
	private Integer price;
	
//	@Column(name="next_val",nullable = true)
//	private Integer next_val;
	
	
	public long getId() {
		return id;
		}
	 
	public void setId(long id) {
		this.id=id;
		}
	
	public String getBook() {
		return book;
		}
	
	public void setBook(String book) {
		this.book = book;
		}
	
	public Integer getPrice() {
		return price;
		}
	
	public void setPrice(Integer price) {
		this.price = price;
		}

}
