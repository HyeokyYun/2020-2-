package com.lab13.app13;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Lab13ServiceImpl implements Lab13Service{
	
	@Autowired
	Lab13DAO lab13DAO;
	
	@Override
	public int insertBoard(Lab13VO vo) {
		return lab13DAO.insertBoard(vo);
	}
	@Override
	public int deleteBoard(int seq) {
		return lab13DAO.deleteBoard(seq);
	}
	@Override
	public int updateBoard(Lab13VO vo) {
		return lab13DAO.updateBoard(vo);
	}
	@Override
	public Lab13VO getBoard(int seq) {
		return lab13DAO.getBoard(seq);
	}
	@Override
	public List<Lab13VO> getBoardList() {
		return lab13DAO.getBoardList();
	}
}
