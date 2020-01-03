package com.shinstealer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.shinstealer.domain.NoteVO;

public interface NoteMapper {
	
	//@Select("select * from tech_board where bno > 0")
	public List<NoteVO> getList();

}
