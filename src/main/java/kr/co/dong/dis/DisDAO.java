package kr.co.dong.dis;

import java.util.List;

public interface DisDAO {
	List<DisBean> listAll();
	
	DisBean selectOne(int id);
	
	int insert(DisBean db);
	
	int update(DisBean db);
	
	int delete(int id);
}
