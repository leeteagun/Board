package kr.co.dong.com;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComDAOImpl implements ComDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	private final static String Adun = "kr.co.dong.mapper.";

	@Override
	public List<ComBean> listAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Adun + "comlist");
	}

	@Override
	public ComBean selectOne(int id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Adun + "comDetail", id);
	}

	@Override
	public int insert(ComBean cb) {
		// TODO Auto-generated method stub
		return sqlSession.insert(Adun + "cominsert", cb);
	}

	@Override
	public int update(ComBean cb) {
		// TODO Auto-generated method stub
		return sqlSession.update(Adun + "comupdate", cb);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return sqlSession.delete(Adun + "comdelete", id);
	}
	
	
}
