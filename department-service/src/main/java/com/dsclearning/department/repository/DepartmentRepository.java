/**
 * 
 */
package com.dsclearning.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsclearning.department.entity.Department;

/**
 * @author duchauha
 *
 */

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	/**
	 * @param departmentId
	 * @return
	 */
	Department findByDepartmentId(Long departmentId);

}
