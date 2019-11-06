package com.shinstealer.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shinstealer.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class NoteMapperTests {

	@Setter(onMethod_ = @Autowired)
	private NoteMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(note -> log.info(note));
	}
}
