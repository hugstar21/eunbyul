package com.star.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.star.service.BoardServiceImp;
import com.star.starDTO.BoardDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardServiceImp service;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String main(){
		return "main";
	}
	
	@RequestMapping("/list")
	public String board(Model model) {
		List<BoardDTO> list=service.getList();
		model.addAttribute("list",list);
		return "board/list";
	}
	
	@RequestMapping("/test.do") // ���� X 
    public String test() {
        return "board/test";
    }    
    
    /**
     * Tiles�� ���(header, left, footer ����)
     */        
    @RequestMapping("/testPage.do") // base
    public String testPage() {
        return "board/test.page";
    }
    
    /**
     * Tiles�� ���(header, left, footer ����)
     */    
    @RequestMapping("/testPart.do") // baseEmpty
    public String testPart() {
        return "board/test.part";
    }        
}
