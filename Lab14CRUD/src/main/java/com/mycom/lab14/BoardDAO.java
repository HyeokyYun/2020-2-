package com.mycom.lab14;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertBoard(BoardVO vo) {
		int result = sqlSession.update("Board.insertBoard", vo);
		return result;
	}
	
	public List<BoardVO> getBoardList() {
		List<BoardVO> list = null;
		list = sqlSession.selectList("Board.getBoardList");
		return list;
	}
	
	public BoardVO getBoard(int seq) {
		BoardVO vo = null;
		vo = sqlSession.selectOne("Board.getBoard", seq);
		return vo;
	}
	
	
	public int deleteBoard(int seq) {
		int result = sqlSession.delete("Board.deleteBoard", seq);
		return result;
	}
	
	public int updateBoard(BoardVO vo) {
		int result = sqlSession.update("Board.updateBoard", vo);
		return result;
	}
}
