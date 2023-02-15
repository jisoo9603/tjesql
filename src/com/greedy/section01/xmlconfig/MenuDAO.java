package com.greedy.section01.xmlconfig;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MenuDAO {

	public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {
		
		return sqlSession.selectList("MenuMapper.selectAllMenu");
	}

	public MenuDTO selectMenuByCode(SqlSession sqlSession, int code) {

		return sqlSession.selectOne("MenuMapper.selectMenuByCode", code);
	}

	public int insertMenu(SqlSession sqlSession, MenuDTO menu) {
		
		return sqlSession.insert("MenuMapper.insertMenu", menu);
	}

	public int modifyMenu(SqlSession sqlSession, MenuDTO menuList) {

		return sqlSession.update("MenuMapper.modifyMenu", menuList);
	}
	
	public int removeMenu(SqlSession sqlSession, MenuDTO menuList) {

		return sqlSession.update("MenuMapper.removeMenu", menuList);
	}
	

}
