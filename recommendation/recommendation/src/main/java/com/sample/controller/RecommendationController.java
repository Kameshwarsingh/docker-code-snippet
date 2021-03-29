package com.sample.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

	@GetMapping("/user")
	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
		return Collections.singletonMap("name", principal.getAttribute("name"));
	}

	@GetMapping("/recommendation")
	@ResponseBody
	public Map<String, Object> recommendation(@AuthenticationPrincipal OAuth2User principal) {
		List<String> recommendations = new ArrayList<String>();
		recommendations.add("vanila");
		recommendations.add("chocolate");
		recommendations.add("strawberry");
		return Collections.singletonMap("name", recommendations.toString());

		
	}

}
