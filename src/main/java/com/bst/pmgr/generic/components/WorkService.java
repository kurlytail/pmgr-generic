package com.bst.pmgr.generic.components;

import org.springframework.stereotype.Service;

import com.bst.pmgr.generic.entities.Work;

@Service
public class WorkService {
		
	public Work create(final String name) {
		return new Work();
	}

}
