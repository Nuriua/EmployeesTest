package com.selva.employeestest.data.repository

import android.util.Log
import com.selva.employeestest.data.mapper.EmployeeListMapper
import com.selva.employeestest.data.network.api.ApiFactory
import com.selva.employeestest.domain.EmployeeRepository
import com.selva.employeestest.domain.entity.Employee

class EmployeeRepositoryImpl: EmployeeRepository {

    private val apiService = ApiFactory.apiService

    override suspend fun getEmployeeList(): List<Employee> {
        try {
            val dtoResponse = apiService.getEmployees()
            val dtoList = dtoResponse.employeeList
            return EmployeeListMapper().mapDtoToToEntity(dtoList)
        } catch (e: Exception) {
            Log.e("EmployeeRepositoryImpl", "Error fetching employee list", e)
        }
        return emptyList()
    }
}
