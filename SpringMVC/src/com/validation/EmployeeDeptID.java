package com.validation;


import java.lang.annotation.*;

import javax.validation.*;


@Constraint(validatedBy=EmpValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeDeptID {

	public String[] value() default "IT";
	public String message() default "must start with IT or CS or EE";
	//define default groups
	public Class<?>[] groups() default {};
	
	
	//define default payload 
	public Class<? extends Payload>[] payload() default {};
	
}
