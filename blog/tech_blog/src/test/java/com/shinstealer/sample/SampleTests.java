package com.shinstealer.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shinstealer.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class SampleTests {

	@Setter(onMethod_ = { @Autowired })
	private Restaurant resaurant;
	
	@Test
	public void testExist() {
		assertNotNull(resaurant);
		
		log.info(resaurant);
		log.info("--------------------");
		log.info(resaurant.getChef());
	}
}
