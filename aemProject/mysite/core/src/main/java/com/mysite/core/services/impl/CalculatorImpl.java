package com.mysite.core.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import com.mysite.core.services.Calculator;

@Component(service = Calculator.class, immediate = true)
@Designate(ocd = CalculatorConfiguration.class)
public class CalculatorImpl implements Calculator {

	public String orgName;
	public String description;
	public int noOfEmployees;
	public String location;
	String services;

	@Activate
	public void activate(CalculatorConfiguration config) {
//		factor = config.calculator_multiply_factor();
//		numbers = config.calculator_numbers();
//		isTrue = config.is_true();
		orgName= config.organisation_name();
		description= config.description_name();
		noOfEmployees= config.no_of_employees();
		location= config.location_name();
		services= config.services_name();
	}

	public String organisationName() {
		// TODO Auto-generated method stub
		return orgName;
	}

	
	public String description() {
		// TODO Auto-generated method stub
		return description;
	}

	public int noOfEmployees() {
		// TODO Auto-generated method stub
		return noOfEmployees;
	}

	public String location() {
		// TODO Auto-generated method stub
		return location;
	}

	public String organisationServices() {
		// TODO Auto-generated method stub
		return services;
	}

//	@Modified
//	public void modified() {
//	}
//
//	@Deactivate
//	public void deactivate() {
//	}
//
//	@Override
//	public int add(int a, int b) {
//		return a + b;
//	}
//
//	@Override
//	public int substract(int a, int b) {
//		return a - b;
//	}
//
//	@Override
//	public int multiply(int a, int b) {
//		return a * b;
//	}
//
//	@Override
//	public int multiplyByFactor(int a) {
//		return a * factor;
//	}

}
