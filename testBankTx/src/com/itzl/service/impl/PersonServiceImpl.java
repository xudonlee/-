package com.itzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itzl.service.BankService;
import com.itzl.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private  BankService bs;
	@Override
	public int zhuanZhang() {
		bs.getQian();
		bs.putQian();
		return 1;
	}

}
