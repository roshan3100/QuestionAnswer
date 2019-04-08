package com.ComStore.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="answer")
public class Answer { 

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;  
	
	@Column(name="answer_name")
	private String answername;  
	
	@Column(name="posted_by")
	private String postedby; 

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="question_id")
	private Question ans;
	
	public Answer() {
//		System.out.println("Roshan");
	}

	public Answer(int id, String answername, String postedby, Question ans) {
		super();
		this.id = id;
		this.answername = answername;
		this.postedby = postedby;
		this.ans = ans;
//		System.out.println("Pinky");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedby() {
		return postedby;
	}

	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}

	public Question getAns() {
		return ans;
	}

	public void setAns(Question ans) {
		this.ans = ans;
	}  

	
}