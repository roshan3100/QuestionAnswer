package com.ComStore.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComStore.dao.QuestionDao;
import com.ComStore.model.Question;

@Service
public class saveXMLDataImpl implements saveXMLData{
	
	@Autowired
	private QuestionDao questionDAO;
	

	@Override
	@Transactional
	public void saveData(Question ques) {	
	//	 System.out.println(ques.getId()+" 1 "+ques.getQuestionname());
		questionDAO.saveCustomer(ques);
	}

}
