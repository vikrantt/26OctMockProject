package com.mysite.core.services.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Calculator Configuration")
public @interface CalculatorConfiguration {

//	@AttributeDefinition(name = "Multiply Factor", required = true,
//			description = "enter factor to which given number should be multiplied with")
//	int calculator_multiply_factor() default 4;
	
	@AttributeDefinition(name = "orgName", required = true,
			description = "enter the organisation name:")
	String organisation_name() default "ToTheNew";
	
	@AttributeDefinition(name = "orgDesc", required = true,
			description = "enter the description:")
	String description_name() default "AMC";
	
	@AttributeDefinition(name = "noOfEmployees", required = true,
			description = "enter the number of employees:")
	int no_of_employees() default 6000;
	
	@AttributeDefinition(name = "Location", required = true,
			description = "enter the location:")
	String location_name() default "Noida";
	
	@AttributeDefinition(name = "Services", required = true,
			description = "enter the services:")
	String services_name() default "AMC";

	
//    @AttributeDefinition(
//            name = "calculator numbers",
//            type = AttributeType.STRING,
//            cardinality = Integer.MAX_VALUE)
//    String[] calculator_numbers();
//
//    @AttributeDefinition(
//            name = "Boolean value",
//            type = AttributeType.BOOLEAN)
//    boolean is_true();

}
