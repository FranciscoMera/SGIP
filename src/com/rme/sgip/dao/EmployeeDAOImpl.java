package com.rme.sgip.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rme.sgip.model.Employee;

@Repository("employeeDao")
public class EmployeeDAOImpl extends AbstractDAO<Integer, Employee> implements EmployeeDAO {
    
    /**
     *
     * @param id
     * @return
     */
    @Override
    public Employee findById(int id) {
        return getByKey(id);
    }

    /**
     *
     * @param employee
     */
    @Override
    public void saveEmployee(Employee employee) {
        persist(employee);
    }

    /**
     *
     * @param ssn
     */
    @Override
    public void deleteEmployeeBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }

    /**
     *
     * @return
     */
    @Override
    public List<Employee> findAllEmployees() {
        Criteria criteria = createEntityCriteria();
        return (List<Employee>) criteria.list();
    }

    /**
     *
     * @param ssn
     * @return
     */
    @Override
    public Employee findEmployeeBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Employee) criteria.uniqueResult();
    }

}
