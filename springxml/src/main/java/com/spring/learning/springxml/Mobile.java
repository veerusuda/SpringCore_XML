package com.spring.learning.springxml;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.learning.springxml.Processor;

public class Mobile {
	
	private String brand;
	
	@Autowired
	private Processor processor;
	
	public Mobile(Processor processor) {
		super();
		this.processor = processor;
	}
	public Mobile(String brand) {
		super();
		this.brand = brand;
	}
	public Mobile() {
		super();
	}
	public Mobile(String brand, Processor processor) {
		super();
		this.brand = brand;
		this.processor = processor;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public void getMobileDetails() {
		System.out.println("My Mobile Is "+brand);
		processor.getProcessorDetails();
	}
	
}
