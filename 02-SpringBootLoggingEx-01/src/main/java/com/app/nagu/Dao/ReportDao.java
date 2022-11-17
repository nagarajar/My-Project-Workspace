package com.app.nagu.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportDao 
{
	Logger logger = LoggerFactory.getLogger(ReportDao.class);
	
	public String getName(Integer id)
	{
		String name = "";
		
		logger.info("getName(Integer id) - method start");
		
		if(id == 101)
			name = "Nagaraja";
		else if (id == 102)
			name = "Ankith";
		else
			name = "Invalid Id";
		
		logger.info("getName(Integer id) - method end");

		return name;
	}
}
