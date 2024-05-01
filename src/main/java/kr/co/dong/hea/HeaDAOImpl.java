package kr.co.dong.hea;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HeaDAOImpl implements HeaDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	private final static String Adun = "kr.co.dong.mapper.";

	@Override
	public List<HeaBean> listAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Adun + "healist");
	}

	@Override
	public HeaBean selectOne(int id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Adun + "heaDetail", id);
	}

	@Override
	public int insert(HeaBean hb) {
		// TODO Auto-generated method stub
		return sqlSession.insert(Adun + "heainsert", hb);
	}

	@Override
	public int update(HeaBean hb) {
		// TODO Auto-generated method stub
		return sqlSession.update(Adun + "heaupdate", hb);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return sqlSession.delete(Adun + "headelete", id);
	}
	
	
}
