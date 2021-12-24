package org.springframework.selftest.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public void hello() {
		System.out.println("Hello,sevenluo!");
	}
}
