package com.ComStore.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ComStore.model.Question;

@Repository
public class QuestionImpl implements QuestionDao {
	
	// need to inject the session factory
		@Autowired
		@Qualifier("sessionFactory")
		private SessionFactory sessionFactory;

	@Override
	public void saveCustomer(Question ques) {
		
	//	System.out.println(ques.getId()+" 2 "+ques.getQuestionname());
		// TODO Auto-generated method stub

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/upate the customer
		currentSession.saveOrUpdate(ques);
		
	//	System.out.println(ques.getId()+" 3 "+ques.getQuestionname());

	}
}
