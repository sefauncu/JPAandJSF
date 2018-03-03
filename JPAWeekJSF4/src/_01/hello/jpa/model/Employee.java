package _01.hello.jpa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kisiler")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="kisiId")
	private int id;
	@Column(name="kisiIsim")
	private String name;
	@Column(name="kisiSoyisim")
	private String surname;
	@Column(name="kisiMaas")
	private int salary;


	public Employee() {
		// Entity icin default constructor gerekli.
		super();
	}

	public Employee(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

}
