package com.selva.employeestest.data.mapper

import com.selva.employeestest.data.network.model.EmployeeDto
import com.selva.employeestest.domain.entity.Employee
import java.util.*

class EmployeeMapper {

    fun mapDtoToToEntity(dto: EmployeeDto): Employee {
        return Employee(
            name = dto.fName,
            lastName = dto.lName,
            birthday = dto.birthday,
            avatarUrl = dto.avatrUrl
        )
    }
}