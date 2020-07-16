package com.star.service;

import java.util.List;

import com.star.starDTO.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getList();
	public int insert(BoardDTO board);
	public BoardDTO read(int bno);
	public int delete(int bno);
	public boolean update(BoardDTO board);
}
