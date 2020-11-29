package com.lab13.app13;

import java.util.List;

public interface Lab13Service {
	public int insertBoard(Lab13VO vo);
	public int deleteBoard(int seq);
	public int updateBoard(Lab13VO vo);
	public Lab13VO getBoard(int seq);
	public List<Lab13VO> getBoardList();
}
