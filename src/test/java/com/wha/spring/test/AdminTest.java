package com.wha.spring.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wha.spring.config.DataConfig;
import com.wha.spring.config.WebConfig;
import com.wha.spring.iservice.IAdminService;
import com.wha.spring.model.Admin;
import com.wha.spring.service.AdminServiceImpl;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebConfig.class, DataConfig.class})
public class AdminTest {

	@Autowired
	IAdminService ias;
	AdminServiceImpl asi;
	Admin a;
	
	@Test
	@Transactional
	@Rollback(true)
	public void test() {
		assertThat(asi, instanceOf(AdminServiceImpl.class));
		assertThat(a, instanceOf(Admin.class));
	}
}
