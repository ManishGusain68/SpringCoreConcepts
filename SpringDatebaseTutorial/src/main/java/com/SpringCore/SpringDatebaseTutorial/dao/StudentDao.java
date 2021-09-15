package com.SpringCore.SpringDatebaseTutorial.dao;

import com.SpringCore.SpringDatebaseTutorial.Entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);

}
