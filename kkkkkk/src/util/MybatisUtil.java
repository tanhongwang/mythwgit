package util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * mybatis�������ݿ�Ĺ�����
 * @author Administrator
 *
 */
public class MybatisUtil {
	// ���巽����ȡSqlSession
	public static SqlSession openSession(){
		SqlSession session = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = 
				new SqlSessionFactoryBuilder().build(in);
			session = sessionFactory.openSession(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	
	
	// ����һ��������ȡָ���ӿڵĴ����࣬���ӿڵ�ʵ����
	public static Object getMapper(Class cls){
		SqlSession session = openSession();
		return session.getMapper(cls);
	}

}
