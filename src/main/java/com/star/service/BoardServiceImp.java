package com.star.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.mapper.BoardMapper;
import com.star.starDTO.BoardDTO;

import lombok.Setter;

@Service("homeservice")
public class BoardServiceImp implements BoardService {

	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	@Override
	public List<BoardDTO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public int insert(BoardDTO board) {
		// TODO Auto-generated method stub
		return mapper.insert(board);
	}

	@Override
	public BoardDTO read(int bno) {
		// TODO Auto-generated method stub
		return mapper.read(bno);
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		return mapper.delete(bno);
	}

	@Override
	public boolean update(BoardDTO board) {
		// TODO Auto-generated method stub
		return mapper.update(board)==1;
	}

}
