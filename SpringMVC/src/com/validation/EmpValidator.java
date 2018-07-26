package com.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmpValidator implements ConstraintValidator<EmployeeDeptID, String> {
	
	private String[] depCode;
	@Override
	public boolean isValid(String userValue, ConstraintValidatorContext arg1) {
		for(String s:depCode) {
		if(userValue!=null && userValue.startsWith(s))
			return true;
		}
		return false;
	
}
	
	@Override
	public void initialize(EmployeeDeptID constraintAnnotation) {
		
		depCode =constraintAnnotation.value();
	}
}
