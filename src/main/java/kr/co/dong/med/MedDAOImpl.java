package kr.co.dong.med;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MedDAOImpl implements MedDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	private final static String Adun = "kr.co.dong.mapper.";

	@Override
	public List<MedBean> listAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Adun + "medlist");
	}

	@Override
	public MedBean selectOne(int id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Adun + "medDetail", id);
	}

	@Override
	public int insert(MedBean mb) {
		// TODO Auto-generated method stub
		return sqlSession.insert(Adun + "medinsert", mb);
	}

	@Override
	public int update(MedBean mb) {
		// TODO Auto-generated method stub
		return sqlSession.update(Adun + "medupdate", mb);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return sqlSession.delete(Adun + "medelete", id);
	}
	
	
}
