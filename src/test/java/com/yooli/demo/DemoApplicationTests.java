package com.yooli.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		List<User> lists=new ArrayList<>();
		for (int i=0;1<10;i++){
			lists.add(new User(i,"name"+String.valueOf(i)));
		}

//		List<String> sets=lists.stream().map(e -> e.getName()).collect(Collectors.toList());
//
//		System.out.println(sets);
	}

}
