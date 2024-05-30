package com.selva.employeestest.data.mapper

import com.selva.employeestest.data.network.model.EmployeeDto
import com.selva.employeestest.domain.entity.Employee

class EmployeeListMapper {

    fun mapDtoToToEntity(dto: List<EmployeeDto>?): List<Employee> {
        return dto?.map {EmployeeMapper().mapDtoToToEntity(it)} ?: emptyList()
    }
}