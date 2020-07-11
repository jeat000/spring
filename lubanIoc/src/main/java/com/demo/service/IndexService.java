package com.demo.service;

import com.demo.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenjian
 * @desc
 * @date Created in 2020/7/3 16:16
 */
@Service
public class IndexService {

	@Autowired
	IndexDao indexDao;

	public void say(String str) {
		System.out.println(str);
	}
}
