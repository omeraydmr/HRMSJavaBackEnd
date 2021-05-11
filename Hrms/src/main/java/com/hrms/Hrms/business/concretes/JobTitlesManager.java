package com.hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.Hrms.business.abstracts.JobTitlesService;
import com.hrms.Hrms.dataAccess.abstracts.JobTitlesDao;
import com.hrms.Hrms.entities.concretes.JobTitles;

@Service
public class JobTitlesManager implements JobTitlesService{
	
	private JobTitlesDao jobTitlesDao;
	
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}

	@Override
	public List<JobTitles> getAll() {
		return this.jobTitlesDao.findAll();
	}

}
