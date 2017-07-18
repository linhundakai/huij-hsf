package org.huij.hsf.api.service;

import org.huij.hsf.api.domain.Member;

public interface MemberService {

	/**
	 * 通过ID获取用户信息
	 * @param id 会员ID
 	 * @return 会员所有信息
	 */
	public Member getMember(Long id);
	
}
