package _01.hello.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import _01.hello.jpa.dao.EmployeeDAO;
import _01.hello.jpa.dao.EmployeeDAOImpl;
import _01.hello.jpa.model.Employee;

@ManagedBean(name="employeeManagedBean")
@SessionScoped
public class EmployeeMenagedBean {

	private Employee employee;
	private List<Employee> employees;

	
	
	public EmployeeMenagedBean() {
		employee = new Employee();
		employees = new ArrayList<>();
		
		
	}

	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(){
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.insertEmployee(employee);
		employees = employeeDAO.findAllEmployees();
	}
	public void deleteEmployee(int id){
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.removeEmployee(id);
		employees = employeeDAO.findAllEmployees();
	}
}
