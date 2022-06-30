package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class FacadeTest {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;

    @Test
    public void companyFindPartName(){
    //Given
    Company companyA = new Company("CompanyA");
    Company companyB = new Company("CompanyB");

        companyDao.save(companyA);
        int companyAId = companyA.getId();
        companyDao.save(companyB);
        int companyBId = companyB.getId();
    //When
    List<Company> findByName = facade.companyFindByPartName("Com");
    //Then
        assertEquals(2, findByName.size());
    //CleanUp
        companyDao.deleteById(companyAId);
        companyDao.deleteById(companyBId);
}


    @Test
    public void employeeFindByName() {
        //Given
        Employee employee1 = new Employee("Adam","Asnyk");
        Employee employee2 = new Employee("Adam", "Mickiewicz");
        Employee employee3 = new Employee("Henryk","Sienkiewicz");

        employeeDao.save(employee1);
        int employee1Id = employee1.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();
        employeeDao.save(employee3);
        int employee3Id = employee3.getId();
        //When
        List<Employee> findByName = facade.employeeFindByPartName("wicz");
        //Then
        assertEquals(2,findByName.size());
        //CleanUp
        employeeDao.deleteById(employee1Id);
        employeeDao.deleteById(employee2Id);
        employeeDao.deleteById(employee3Id);

    }
}
