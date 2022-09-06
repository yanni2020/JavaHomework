package Serializable;
import java.io.Serializable;


/**
 * Problems: Define a “Employee” POJO class and make it serializable
 */
public class Employee implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    transient private int salary;
    private static int companyId = 2022;

    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setSalary(int salary){this.salary = salary;}

    public int getId(){return id;}
    public String getName(){return name;}
    public int salary(){return salary;}
    public static int getCompanyId() {return companyId;}

}
