package com.test.akt8;

import com.test.akt8.Employees;
import com.test.akt8.Offices;
import com.test.akt8.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-09T23:39:10")
@StaticMetamodel(Departments.class)
public class Departments_ { 

    public static volatile CollectionAttribute<Departments, Employees> employeesCollection;
    public static volatile SingularAttribute<Departments, Date> createdat;
    public static volatile SingularAttribute<Departments, Offices> officeid;
    public static volatile SingularAttribute<Departments, String> departmentname;
    public static volatile SingularAttribute<Departments, Integer> id;
    public static volatile SingularAttribute<Departments, Users> userid;
    public static volatile SingularAttribute<Departments, Date> updatedat;

}