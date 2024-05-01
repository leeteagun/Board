package kr.co.dong.dis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DisDAOImpl implements DisDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	private final static String Adun = "kr.co.dong.mapper.";

	@Override
	public List<DisBean> listAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Adun + "dislist");
	}

	@Override
	public DisBean selectOne(int id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Adun + "disDetail", id);
	}

	@Override
	public int insert(DisBean db) {
		// TODO Auto-generated method stub
		return sqlSession.insert(Adun + "disinsert", db);
	}

	@Override
	public int update(DisBean db) {
		// TODO Auto-generated method stub
		return sqlSession.update(Adun + "disupdate", db);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return sqlSession.delete(Adun + "disdelete", id);
	}
	
	
}
