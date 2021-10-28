package com.spring.lesson.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.lesson.controller.LessonController;
import com.spring.lesson.dao.LessonMapper;
import com.spring.lesson.vo.LessonVO;

@Service
@Transactional
public class LessonServiceImpl implements LessonService {
	private Logger logger = Logger.getLogger(LessonController.class);
	
	@Autowired(required=false)
	private LessonMapper lessonMapper;

	@Override
	public List<LessonVO> listLesson(LessonVO param) {
		// TODO Auto-generated method stub
		logger.info("LessonServiceImpl listLesson >>>>  param :::: " + param);
		
		List<LessonVO> list = new ArrayList<LessonVO>(); 
		list = lessonMapper.listLesson(param);
		return list;
	}

	@Override
	public LessonVO selectLesson(int no) {
		// TODO Auto-generated method stub
		return lessonMapper.selectLesson(no);
	}

	@Override
	public int insertLesson(LessonVO param) {
		// TODO Auto-generated method stub
		return lessonMapper.insertLesson(param);
	}

	@Override
	public int updateLesson(LessonVO param) {
		// TODO Auto-generated method stub
		return lessonMapper.updateLesson(param);
	}

	@Override
	public int deleteLesson(int no) {
		// TODO Auto-generated method stub
		return lessonMapper.deleteLesson(no);
	}

}
