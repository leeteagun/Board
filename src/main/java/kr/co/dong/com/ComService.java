package kr.co.dong.com;

import java.util.List;

public interface ComService {
	List<ComBean> listAll();
	
	ComBean selectOne(int id);
	
	int insert(ComBean cb);
	
	int update(ComBean cb);
	
	int delete(int id);
	
}
