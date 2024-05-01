package kr.co.dong.med;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedServiceImpl implements MedService{

	@Autowired
	MedDAO medDao;

	@Override
	public List<MedBean> listAll() {
		// TODO Auto-generated method stub
		return medDao.listAll();
	}

	@Override
	public MedBean selectOne(int id) {
		// TODO Auto-generated method stub
		return medDao.selectOne(id);
	}

	@Override
	public int insert(MedBean mb) {
		// TODO Auto-generated method stub
		return medDao.insert(mb);
	}

	@Override
	public int update(MedBean mb) {
		// TODO Auto-generated method stub
		return medDao.update(mb);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return medDao.delete(id);
	}
}
