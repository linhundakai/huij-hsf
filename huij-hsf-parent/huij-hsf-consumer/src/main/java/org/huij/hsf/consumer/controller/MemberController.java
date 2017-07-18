package org.huij.hsf.consumer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.huij.hsf.api.domain.Member;
import org.huij.hsf.api.service.MemberService;
import org.huij.hsf.consumer.dto.MemberDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MemberService memberService;

	@RequestMapping(method = RequestMethod.GET, path = "/id")
	public Member getMembers(@Valid MemberDto dto, BindingResult result, HttpServletRequest request) {
		logger.info("start query member info by id");
		return memberService.getMember(1L);
	}

}
