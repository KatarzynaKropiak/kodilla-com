package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class Facade {
    @Autowired
    private EmployeeDao employee;
    @Autowired
    private CompanyDao company;


    public List<Company> companyFindByPartName(final String name){
        return company.findByPartOfName(name);
    }

    public List<Employee> employeeFindByPartName(final String name) {
        return employee.findByPartOfName(name);
    }
}