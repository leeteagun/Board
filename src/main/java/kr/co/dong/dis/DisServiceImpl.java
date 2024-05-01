package kr.co.dong.dis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisServiceImpl implements DisService{

	@Autowired
	DisDAO disDao;

	@Override
	public List<DisBean> listAll() {
		// TODO Auto-generated method stub
		return disDao.listAll();
	}

	@Override
	public DisBean selectOne(int id) {
		// TODO Auto-generated method stub
		return disDao.selectOne(id);
	}

	@Override
	public int insert(DisBean db) {
		// TODO Auto-generated method stub
		return disDao.insert(db);
	}

	@Override
	public int update(DisBean db) {
		// TODO Auto-generated method stub
		return disDao.update(db);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return disDao.delete(id);
	}
}
