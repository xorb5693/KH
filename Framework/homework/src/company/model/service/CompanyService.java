package company.model.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.SqlSessionTemplate;
import company.model.dao.CompanyDao;
import company.model.vo.Company;

public class CompanyService {

	public ArrayList<Company> selectAllCompany() {
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		List<Company> list = new CompanyDao().selectAllCompany(session);
		
		session.close();
		
		return (ArrayList<Company>)list;
	}

	public Company selectOneCompany(int companyCode) {

		SqlSession session = SqlSessionTemplate.getSqlSession();
		Company com = new CompanyDao().selectOneCompany(session, companyCode);
		
		session.close();
		
		return com;
	}

}
