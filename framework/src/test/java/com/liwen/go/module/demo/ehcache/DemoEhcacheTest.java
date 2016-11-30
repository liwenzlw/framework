package com.liwen.go.module.demo.ehcache;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liwen.go.demo.ehcache.DemoEhcache;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context-base.xml" })
public class DemoEhcacheTest {

	@Autowired
	private DemoEhcache demoEhcache;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCacheable() {
		demoEhcache.findBook(1);
		demoEhcache.findBook(2);
		demoEhcache.findBook(1);
		demoEhcache.findBook(3);
		demoEhcache.findBook(3);
	}
}
