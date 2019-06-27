package com.itzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itzl.dao.BankDao;
import com.itzl.service.BankService;
@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDao bd;
	@Override

	public int getQian() {
		
		return bd.getQian();
	}

	@Override

	public int putQian() {
		
		return bd.putQian();
	}

}
