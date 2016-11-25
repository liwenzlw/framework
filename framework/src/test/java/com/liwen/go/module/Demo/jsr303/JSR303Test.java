package com.liwen.go.module.Demo.jsr303;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
// defaults to "file:src/main/webapp"
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring-context-base.xml", "classpath:spring-context-datasource.xml",
		"classpath:spring-context-mybatis.xml", "classpath:spring-context-shiro.xml", "classpath:spring-mvc.xml",
		"classpath:spring-context-i18n.xml", "classpath:spring-context-jsr303.xml" })
public class JSR303Test {
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void jSR303Test() throws Exception {
		this.mockMvc.perform(get("/jsr303demo/userj_jsr")
				//.param("name", "小明")
//				.param("hobby", "篮球")
				.accept(MediaType.parseMediaType("application/json")))
				.andExpect(status().isOk());
	}
}
