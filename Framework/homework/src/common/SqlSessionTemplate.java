package common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {

	public static SqlSession getSqlSession() {
		
		SqlSession session = null;
		String resource = "mybatis-config.xml";
		
		try {
			//해당 리소스경로로 InputStrema 생성
			InputStream is = Resources.getResourceAsStream(resource);
			
			//팩토리 빌더 생성
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			//팩토리 생성
			SqlSessionFactory factory = builder.build(is);
			
			session = factory.openSession(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return session;
	}
}
