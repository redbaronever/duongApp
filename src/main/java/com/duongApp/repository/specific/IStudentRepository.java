package com.duongApp.repository.specific;

import java.util.List;

import com.duongApp.entity.Student;
import com.duongApp.repository.base.BaseRepository;

public interface IStudentRepository extends BaseRepository<Student> {
	List<Student> getStudentByNameLike(String like);
}
