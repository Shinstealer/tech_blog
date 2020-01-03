package com.shinstealer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.shinstealer.domain.NoteVO;

public interface NoteMapper {
	
	public List<NoteVO> getList();
	
	public void insert(NoteVO note);
	
	public void insertSelectKey(NoteVO note);
	
	public NoteVO read(Long bno);

}
