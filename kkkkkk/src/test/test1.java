package test;

import dao.StudentDao;
import entity.Students;
import util.MybatisUtil;

public class test1 {
	public static void main(String[] args) {
		StudentDao dao = (StudentDao) MybatisUtil.getMapper(StudentDao.class);
		Students stu=dao.querybyid(2);
		System.out.println(stu);
	}
}
