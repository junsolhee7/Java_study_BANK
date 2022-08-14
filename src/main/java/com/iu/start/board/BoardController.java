package com.iu.start.board;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	
	@RequestMapping(value="list.gg", method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		System.out.println("list 실행");
		
		BoardDAO boardDAO = new BoardDAO();
		
		ArrayList<BoardDTO> ar = boardDAO.getList();
		
		model.addAttribute("list",ar);
		
		return "board/list";
	}


	@RequestMapping(value="detail.gg", method=RequestMethod.GET)
	public ModelAndView detail(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("detail 실행");
		
		BoardDAO boardDAO = new BoardDAO();
		boardDTO = boardDAO.getDetail(boardDTO);
		
		mv.addObject("dto",boardDTO);
		mv.setViewName("board/detail");
		
		return mv;
	}

}
