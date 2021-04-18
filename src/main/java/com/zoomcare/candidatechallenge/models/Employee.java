package com.zoomcare.candidatechallenge.models;

import java.util.List;
import java.util.Map;

public class Employee {
  private Long id;
  private Map<String, String> properties;
  private List<Employee> directReports;

  public Employee(Long id, Map<String, String> properties, List<Employee> directReports) {
    this.id = id;
    this.properties = properties;
    this.directReports = directReports;
	}

	public Long getId() {
		return this.id;
  }

	public Map<String, String> getProperties() {
		return this.properties;
  }

  public List<Employee> getDirectReports() {
    return this.directReports;
  }
}