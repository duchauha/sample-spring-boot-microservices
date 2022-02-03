/**
 * 
 */
package com.dsclearning.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsclearning.department.entity.Department;
import com.dsclearning.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author duchauha
 *
 */
@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	/**
	 * @param department
	 * @return
	 */
	public Department saveDepartment(Department department) {
       
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	/**
	 * @param departmentId
	 * @return
	 */
	 public Department findDepartmentById(Long departmentId) {
	        log.info("Inside saveDepartment of DepartmentService");
	        return departmentRepository.findByDepartmentId(departmentId);
	    }

}
