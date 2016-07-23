package com.alexbt.jpa;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardToDataRestController {

	@RequestMapping(path = "{repo}/{id}/{entity}")
	public String postEmployees(@PathVariable("entity") String entity) throws IOException {
		return "forward:/" + entity;
	}
	
	@RequestMapping(path = "{repo}/{id}/{entity}/{entityId}")
	public String postEmployees(@PathVariable("entity") String entity, @PathVariable("entityId") String entityId) throws IOException {
		return "forward:/" + entity+"/"+entityId;
	}
}
