package kr.co.dong.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComServiceImpl implements ComService{

	@Autowired
	ComDAO comDao;

	@Override
	public List<ComBean> listAll() {
		// TODO Auto-generated method stub
		return comDao.listAll();
	}

	@Override
	public ComBean selectOne(int id) {
		// TODO Auto-generated method stub
		return comDao.selectOne(id);
	}

	@Override
	public int insert(ComBean cb) {
		// TODO Auto-generated method stub
		return comDao.insert(cb);
	}

	@Override
	public int update(ComBean cb) {
		// TODO Auto-generated method stub
		return comDao.update(cb);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return comDao.delete(id);
	}
}
