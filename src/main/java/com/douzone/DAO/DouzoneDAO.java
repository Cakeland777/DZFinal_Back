package com.douzone.DAO;

import org.apache.ibatis.annotations.Mapper;

import com.douzone.entity.DouzoneVO;

@Mapper
public interface DouzoneDAO {
	DouzoneVO login(String MEMBER_ID, String MEMBER_PW);
}
