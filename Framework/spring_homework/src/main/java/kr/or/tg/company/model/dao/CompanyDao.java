package kr.or.tg.company.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.tg.company.model.vo.Company;

@Repository("companyDao")
public class CompanyDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<Company> selectListCompany() {
		
		return sqlSession.selectList("company.selectListCompany");
	}

	public Company selectOneCompany(int companyCode) {
		
		return sqlSession.selectOne("company.selectOneCompany", companyCode);
	}
}
