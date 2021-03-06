package com.spring.lesson.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.lesson.vo.LessonVO;

@Repository
//public class LessonMapperImpl extends SqlSessionDaoSupport implements LessonMapper {
public class LessonMapperImpl implements LessonMapper {
	
	private final String PACKAGE_PATH = "com.spring.lesson.dao.LessonDAO.";
	
	@Autowired(required=false)
	private SqlSession sqlSession;

	@Override
	public List<LessonVO> listLesson(LessonVO param) {
		// TODO Auto-generated method stub
		//return getSqlSession().selectList(PACKAGE_PATH+"listLesson");
		return sqlSession.selectList("listLesson", param);
	}

	@Override
	public LessonVO selectLesson(int no) {
		// TODO Auto-generated method stub
		//return (LessonVO)getSqlSession().selectOne(PACKAGE_PATH+"selectLesson");
		return (LessonVO)sqlSession.selectList("selectLesson", no);
	}

	@Override
	public int insertLesson(LessonVO param) {
		// TODO Auto-generated method stub
		//return (int)getSqlSession().insert(PACKAGE_PATH+"insertLesson");
		return (Integer)sqlSession.insert("insertLesson", param);
	}

	@Override
	public int updateLesson(LessonVO param) {
		// TODO Auto-generated method stub
		//return (int)getSqlSession().update(PACKAGE_PATH+"updateLesson");
		return (Integer)sqlSession.insert("updateLesson", param);
	}

	@Override
	public int deleteLesson(int no) {
		// TODO Auto-generated method stub
		//return (int)getSqlSession().delete(PACKAGE_PATH+"deleteLesson");
		return (Integer)sqlSession.insert("deleteLesson", no);
	}

}
