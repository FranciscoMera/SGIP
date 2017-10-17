package com.rme.sgip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rme.sgip.dao.EmployeeDAO;
import com.rme.sgip.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO dao;

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Employee findById(int id) {
        return dao.findById(id);
    }

    /**
     *
     * @param employee
     */
    @Override
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }

    /**
     *
     * @param employee
     */
    @Override
    public void updateEmployee(Employee employee) {
        Employee entity = dao.findById(employee.getId());
        if (entity != null) {
            entity.setName(employee.getName());
            entity.setSalary(employee.getSalary());
            entity.setSsn(employee.getSsn());
        }
    }

    /**
     *
     * @param ssn
     */
    @Override
    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }
    
    @Override
    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }

    @Override
    public Employee findEmployeeBySsn(String ssn) {
        return dao.findEmployeeBySsn(ssn);
    }

    /**
     *
     * @param id
     * @param ssn
     * @return
     */
    @Override
    public boolean isEmployeeSsnUnique(Integer id, String ssn) {
        Employee employee = findEmployeeBySsn(ssn);
        return (employee == null || ((id != null) && (employee.getId() == id)));
    }
}
