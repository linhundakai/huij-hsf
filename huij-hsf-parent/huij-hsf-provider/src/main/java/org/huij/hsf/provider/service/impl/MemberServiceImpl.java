package org.huij.hsf.provider.service.impl;


import org.huij.hsf.api.domain.Member;
import org.huij.hsf.api.service.MemberService;

import com.alibaba.boot.hsf.annotation.HSFProvider;

@HSFProvider(serviceInterface = MemberService.class, serviceGroup = "HSF", clientTimeout = 3000, serviceVersion = "1.0.0")
public class MemberServiceImpl implements MemberService {

	@Override
	public Member getMember(Long id) {
		Member m = new Member();
		m.setAddr("杭州");
		m.setId(id);
		m.setLevel(2);
		m.setName("Rita");
		System.out.println("模拟业务处理完毕，Member:" + m.toString());
		// 返回结果
		return m;
	}


}
