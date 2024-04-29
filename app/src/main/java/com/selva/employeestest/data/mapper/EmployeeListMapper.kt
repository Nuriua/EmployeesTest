package com.selva.employeestest.data.mapper

import com.selva.employeestest.data.database.EmployeeDbModel
import com.selva.employeestest.data.database.EmployeeListDbModel
import com.selva.employeestest.data.network.model.EmployeeListDto
import com.selva.employeestest.domain.entity.Employee

class EmployeeListMapper {

    fun mapDtoToDbModel(dto: EmployeeListDto): EmployeeListDbModel {
        return EmployeeListDbModel(
            employeeList = dto.employeeList
        )
    }

    fun mapDbModelToEntity(dbModel: EmployeeDbModel): Employee {
        return Employee(
            name = dbModel.name,
            lastName = dbModel.lastName,
            birthday = dbModel.birthday,
            avatarUrl = dbModel.avatarUrl,
            speciality = SpecialityMapper().mapListDbModelToListEntity(dbModel.speciality)
        )
    }
}