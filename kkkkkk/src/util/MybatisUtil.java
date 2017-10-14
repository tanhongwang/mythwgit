package util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * mybatis操作数据库的工具类
 * @author Administrator
 *
 */
public class MybatisUtil {
	// 定义方法获取SqlSession
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
	
	
	// 定义一个方法获取指定接口的代理类，即接口的实现类
	public static Object getMapper(Class cls){
		SqlSession session = openSession();
		return session.getMapper(cls);
	}

}
