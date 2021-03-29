package com.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	public int insertMember(MemberDTO dto);
	public MemberDTO selectAllMember(int cnt);
	public int updateMember();
}
