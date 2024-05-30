package com.selva.employeestest.domain

import com.selva.employeestest.domain.entity.Employee

interface EmployeeRepository {

    suspend fun getEmployeeList(): List<Employee>
}
