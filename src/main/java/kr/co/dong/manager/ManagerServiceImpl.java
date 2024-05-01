package kr.co.dong.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerDAO managerDao;
	
	@Override
	public String manager(int password) {
		// TODO Auto-generated method stub
		return managerDao.manager(password);
	}

}
