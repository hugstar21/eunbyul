package com.star.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.star.starDTO.BoardDTO;

@Mapper
public interface BoardMapper {
	public List<BoardDTO> getList();
	public int insert(BoardDTO board);
	public BoardDTO read(int bno);
	public int delete(int bno);
	public int update(BoardDTO board);
}
