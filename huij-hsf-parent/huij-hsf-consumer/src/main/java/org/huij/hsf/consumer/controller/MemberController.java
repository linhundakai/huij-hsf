package org.huij.hsf.consumer.controller;

import org.huij.hsf.api.domain.Member;
import org.huij.hsf.api.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MemberService memberService;

	@RequestMapping(method = RequestMethod.GET, path = "/id/{id}")
	public Member getMembers(@PathVariable("id") long id) {
		logger.info("start query member info by id");
		return memberService.getMember(id);
	}

}
