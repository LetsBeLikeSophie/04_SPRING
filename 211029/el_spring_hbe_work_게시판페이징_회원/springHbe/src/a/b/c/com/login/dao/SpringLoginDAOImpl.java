package a.b.c.com.login.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.mem.vo.SpringMemberVO;

@Repository
public class SpringLoginDAOImpl implements SpringLoginDAO {
	Logger logger = Logger.getLogger(SpringLoginDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	
	@Override
	public List<SpringMemberVO> loginCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("loginCheck", mvo);
	}
}
