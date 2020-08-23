package com.duongApp.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duongApp.entity.Student;
import com.duongApp.repository.specific.impl.StudentRepository;
import com.duongApp.service.ReportingStudentService;

@Service
public class ReportingStudentServiceImpl implements ReportingStudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	@Transactional
	public List<Student> getAllStudentByName(String nameLike) {
		return studentRepository.getStudentByNameLike(nameLike);
	}

}
