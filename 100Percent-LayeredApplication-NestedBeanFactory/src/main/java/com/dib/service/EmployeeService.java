package com.dib.service;

import java.util.List;

import com.dib.dto.EmployeeDTO;

public interface EmployeeService 
{
public List<EmployeeDTO> fetchEmps(String desg,String desg1) throws Exception;
}
