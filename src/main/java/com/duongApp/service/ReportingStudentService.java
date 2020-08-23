package com.duongApp.service;

import java.util.List;

import com.duongApp.entity.Student;

public interface ReportingStudentService {
	List<Student> getAllStudentByName(String nameLike);
}
