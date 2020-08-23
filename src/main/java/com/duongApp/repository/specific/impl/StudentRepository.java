package com.duongApp.repository.specific.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.duongApp.entity.Student;
import com.duongApp.repository.base.BaseRepositoryImpl;
import com.duongApp.repository.specific.IStudentRepository;

@Repository
public class StudentRepository extends BaseRepositoryImpl<Student> implements IStudentRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentByNameLike(String like) {
		
		String sql = "SELECT * FROM student s WHERE s.name LIKE :like";
		
		return (List<Student>) createSQLQuery(sql).setParameter("like", like).list();
	}
	
}
