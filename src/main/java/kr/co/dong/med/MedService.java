package kr.co.dong.med;

import java.util.List;

public interface MedService {
	List<MedBean> listAll();
	
	MedBean selectOne(int id);
	
	int insert(MedBean mb);
	
	int update(MedBean mb);
	
	int delete(int id);
	
}
