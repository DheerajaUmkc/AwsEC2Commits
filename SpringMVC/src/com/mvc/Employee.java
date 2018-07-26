package com.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.validation.EmployeeDeptID;

public class Employee {
			
			
			private Integer empID;
		/*	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="error enter correct data")
			private String zipcode;*/
			@NotNull
			@Min(value =0, message= "must be >=0")
			@Max(value =10, message= "must be <=10")
			private Integer noOfMoviePasses;
			
			@EmployeeDeptID(value= {"IT","CS","EE"})
			private String deptID;
		/*	
			public String getZipcode() {
				return zipcode;
			}
			public void setZipcode(String zipcode) {
				this.zipcode = zipcode;
				}*/
			
			public String getDeptID() {
				return deptID;
			}
			public void setDeptID(String deptID) {
				this.deptID = deptID;
			}
			
			public Integer getNoOfMoviePasses() {
				return noOfMoviePasses;
			}
			public void setNoOfMoviePasses(Integer noOfMoviePasses) {
				this.noOfMoviePasses = noOfMoviePasses;
			}
			@NotNull(message = "is required")
			@Size(min=2,message=" minimum 2 characters are required in ur FirstName")
			private String firstName;
			@NotNull(message = "is required")
			@Size(min=2,message=" minimum 2 characters are required in ur LastName")
			private String lastName;
			private String country;
			private LinkedHashMap<String, String> countryOptions;
			/*private String operatingSystem;
			private String favLang;
				*/
			
			public Employee() {
				countryOptions = new LinkedHashMap<>();
				countryOptions.put("USA", "USA");
				countryOptions.put("Africa", "Africa");
				countryOptions.put("Nepal", "Nepal");
				countryOptions.put("India", "India");
			}
			
/*			public String getOperatingSystem() {
				return operatingSystem;
			}
			public void setOperatingSystem(String operatingSystem) {
				this.operatingSystem = operatingSystem;
			}
			public String getFavLang() {
				return favLang;
			}
			public void setFavLang(String favLang) {
				this.favLang = favLang;
			}*/
			
			public String getCountry() {
				return country;
			}
			public LinkedHashMap<String, String> getCountryOptions() {
				return countryOptions;
			}
			public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
				this.countryOptions = countryOptions;
			}
			
			public Integer getEmpID() {
				return empID;
			}
			public void setCountry(String country) {
				this.country = country;
			}
			public void setEmpID(Integer empID) {
				this.empID = empID;
			}
			
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			

}


/*//this is tejus code 
package SpringWebPackage;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import SpringWebPackage.validate.EmployeeDeptID;

public class Employee {
	
	
	@EmployeeDeptID(value = {"IT","FN"})
	public String empDeptID;
	
	private Integer empID;
	private String firstName;
	
	@NotNull(message="LastNameisRequired")
	@Size(min=2, message="LastName size IS REQUIRED")
	private String lastName;
	private String country;
	private String[] operatingSystems;
	private String favoriteLanguage;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Invalid Zip")
	private String zipCode;
	
	@NotNull(message="NO:OF PASSES Value should not be empty")
	@Min(value=0, message="NOP Value must be greater than or equal to 0")
	@Max(value=10, message="NOP Value should not be greater than 10")
	private Integer noOfPasses;
	
	public Integer getNoOfPasses() {
		return noOfPasses;
	}

	public void setNoOfPasses(Integer noOfPasses) {
		this.noOfPasses = noOfPasses;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmpDeptID() {
		return empDeptID;
	}

	public void setEmpDeptID(String empDeptID) {
		this.empDeptID = empDeptID;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	private LinkedHashMap<String,String> countryOptions;
	
	public Employee() {
		countryOptions= new LinkedHashMap<>();
		countryOptions.put("USA", "United");
		countryOptions.put("IND", "INDIA");
		countryOptions.put("SRL", "SriLanka");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}

*/



