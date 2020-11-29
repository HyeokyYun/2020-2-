package com.lab13.app13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Lab13DAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insertBoard(Lab13VO vo) {
		String sql = "insert into BOARD (title, writer, content, category) values("
				+ "'" + vo.getTitle() + "',"
				+ "'" + vo.getWriter() + "',"
				+ "'" + vo.getContent() + "',"
				+ "'" + vo.getCategory() + "')";
		return jdbcTemplate.update(sql);
	}
	
	public int deleteBoard(int seq) {
		String sql = "delete from BOARD where seq = " + seq;
		return jdbcTemplate.update(sql);
	}
	
	public int updateBoard(Lab13VO vo) {
		String sql = "update BOARD set title='" + vo.getTitle() + "',"
				+ "title='" +vo.getTitle() + "',"
				+ "writer='" + vo.getWriter() + "',"
				+ "content='" + vo.getContent() + "',"
				+ "category='" +vo.getCategory() + "'where seq=" + vo.getSeq();
		return jdbcTemplate.update(sql);
	}
	
	class BoardRowMapper implements RowMapper<Lab13VO> {
		@Override
		public Lab13VO mapRow(ResultSet rs, int rowNum) throws SQLException {
			Lab13VO vo = new Lab13VO();
			vo.setSeq(rs.getInt("seq"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setWriter(rs.getString("writer"));
			vo.setCategory(rs.getString("category"));
			vo.setRegdate(rs.getDate("regdate"));
			return vo;
		}
	}
	
	public Lab13VO getBoard(int seq) {
		String sql = "select * from BOARD where seq=" + seq;
		return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
	}
	
	public List<Lab13VO> getBoardList() {
		String sql = "select * from BOARD order by regdate desc";
		return jdbcTemplate.query(sql, new BoardRowMapper());
	}
	
}
