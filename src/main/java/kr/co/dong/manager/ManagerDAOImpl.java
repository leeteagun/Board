package kr.co.dong.manager;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAOImpl implements ManagerDAO{

    @Autowired
    private SqlSession sqlSession;

	private final static String Adun = "kr.co.dong.mapper.";
    
	@Override
	public String manager(int passwrod) {
		// TODO Auto-generated method stub
        return sqlSession.selectOne(Adun + "manager", passwrod);

	}
}
