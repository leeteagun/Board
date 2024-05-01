package kr.co.dong.hea;

import java.util.List;

public interface HeaService {
	List<HeaBean> listAll();
	
	HeaBean selectOne(int id);
	
	int insert(HeaBean hb);
	
	int update(HeaBean hb);
	
	int delete(int id);
	
}
