package com.shinstealer.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shinstealer.config.RootConfig;
import com.shinstealer.domain.NoteVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class NoteMapperTests {

	@Setter(onMethod_ = @Autowired)
	private NoteMapper mapper;

	@Test
	public void testGetList() {
		mapper.getList().forEach(note -> log.info(note));
	}

	@Test
	public void testInert() {

		NoteVO note = new NoteVO();
		note.setTitle("테스트좀 하자");
		note.setContent("새로 작성하는 내용");

		mapper.insert(note);
		log.info(note);
	}

	@Test
	public void testInsertSelectKey() {
		NoteVO note = new NoteVO();
		note.setTitle("new test select key");
		note.setContent("new test select key");

		mapper.insertSelectKey(note);
		log.info(note);
	}

	@Test
	public void testRead() {

		NoteVO note = mapper.read(3L);

		log.info(note);
	}

	@Test
	public void testDelete() {

		log.info("delete count: " + mapper.delete(3L));
	}

}
