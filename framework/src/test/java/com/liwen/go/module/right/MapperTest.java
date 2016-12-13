package com.liwen.go.module.right;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.liwen.go.module.right.bean.User;
import com.liwen.go.module.right.mapper.UserMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context-base.xml", "classpath:spring-context-datasource.xml",
		"classpath:spring-context-mybatis.xml", "classpath:spring-context-shiro.xml",
		"classpath:spring-context-i18n.xml" })
public class MapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testMybatisAnnotation() throws InterruptedException{
		while(true) {
			User user = userMapper.selectByUserName("zhang");
			
			System.out.println(user.getRole());
		}
	}
}
