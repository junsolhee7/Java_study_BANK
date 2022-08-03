package com.iu.start.bankMembers;

import java.util.ArrayList;

public interface MembersDAO {

	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception;
	
	
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception;
	
	//검색어를 입력해서 ID를 찾기 abc순으로
}
