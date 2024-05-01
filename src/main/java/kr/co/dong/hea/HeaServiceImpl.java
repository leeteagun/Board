package kr.co.dong.hea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaServiceImpl implements HeaService{

	@Autowired
	HeaDAO heaDao;

	@Override
	public List<HeaBean> listAll() {
		// TODO Auto-generated method stub
		return heaDao.listAll();
	}

	@Override
	public HeaBean selectOne(int id) {
		// TODO Auto-generated method stub
		return heaDao.selectOne(id);
	}

	@Override
	public int insert(HeaBean hb) {
		// TODO Auto-generated method stub
		return heaDao.insert(hb);
	}

	@Override
	public int update(HeaBean hb) {
		// TODO Auto-generated method stub
		return heaDao.update(hb);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return heaDao.delete(id);
	}
}
