package kr.or.tg.company.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.tg.company.model.dao.CompanyDao;
import kr.or.tg.company.model.vo.Company;

@Service("companyService")
public class CompanyService {

	@Autowired
	@Qualifier("companyDao")
	private CompanyDao companyDao;

	public ArrayList<Company> selectListCompany() {
		
		return (ArrayList<Company>)companyDao.selectListCompany();
	}

	public Company selectOneCompany(int companyCode) {
		
		return companyDao.selectOneCompany(companyCode);
	}
}
