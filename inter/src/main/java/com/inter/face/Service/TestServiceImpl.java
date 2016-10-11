package com.inter.face.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inter.face.Mapper.TestMapper;

@Service(value="testservice")
public class TestServiceImpl implements TestService {
	
	
	@Autowired
	private TestMapper testmapper;
	
	
	@Override
	public void testinsert(String t) {
		testmapper.testinsert(t);
	}

}
