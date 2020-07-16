package com.star.starDTO;

import lombok.Data;

@Data
public class BoardDTO {

	private int bno;
	private String title;
	private String content;
	private String writer;
	private String  regdate;
	private String  updatedate;
}
