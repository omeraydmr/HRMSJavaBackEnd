package com.hrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.Hrms.business.abstracts.JobTitlesService;
import com.hrms.Hrms.entities.concretes.JobTitles;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("/api/jobtitles")
public class JobTitlesController {

	@Autowired
	private JobTitlesService jobTitlesService;
		
		

	@GetMapping("/getall")
	public List<JobTitles> getAll(){
		return this.jobTitlesService.getAll();
	}


}
