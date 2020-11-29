package com.lab13.app13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Lab13Controller {
	
	@Autowired
	Lab13ServiceImpl lab13Service;
	
	@RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", lab13Service.getBoardList());
		return "list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPost() {
		return "addpostform";
	}
	
	@RequestMapping(value = "/addok", method = RequestMethod.POST)
	public String addPostOK(Lab13VO vo) {
		if(lab13Service.insertBoard(vo) == 0)
			System.out.println("데이터 추가 실패");
		else
			System.out.println("데이터 추가 성공!!!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id") int id, Model model) {
		Lab13VO lab13VO = lab13Service.getBoard(id);
		model.addAttribute("u", lab13VO);
		return "editform";
	}
	
	@RequestMapping(value = "editform/editok", method = RequestMethod.POST)
	public String editPostOk(Lab13VO vo) {
		if(lab13Service.updateBoard(vo) == 0)
			System.out.println("데이터 수정 실패");
		else
			System.out.println("데이터 수정 성공!!!");
		return "redirect:../../app13/list";
	}
	
	@RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
	public String deletePostOk(@PathVariable("id") int id) {
		if(lab13Service.deleteBoard(id) == 0)
			System.out.println("데이터 삭제 실패");
		else
			System.out.println("데이터 삭제 성공!!!");
		return "redirect:../../app13/list";
	}
}
