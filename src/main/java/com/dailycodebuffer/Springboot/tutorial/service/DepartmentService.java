package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   Department fetchDepartmentById(Long departmentId);

   void deleteDepartmentById(Long departmentId);

   Department updateDepartment(Long departmentId, Department department);
}
