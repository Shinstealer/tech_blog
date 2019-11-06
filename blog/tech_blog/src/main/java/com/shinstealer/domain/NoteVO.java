package com.shinstealer.domain;

import java.util.Date;

import lombok.Data;

@Data
public class NoteVO {
	private Long bno;
	private String title;
	private String content;
	private Date regdate;
	private Date updateDate;

}
