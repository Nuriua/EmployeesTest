package com.selva.employeestest.data.mapper

import com.selva.employeestest.data.database.EmployeeDbModel
import com.selva.employeestest.data.database.SpecialityDbModel
import com.selva.employeestest.data.network.model.EmployeeDto
import com.selva.employeestest.domain.entity.Employee
import java.net.URL
import java.util.*

class EmployeeMapper {

    fun mapDtoToDbModel(dto: EmployeeDto): EmployeeDbModel {
        return EmployeeDbModel(
            name = dto.fName,
            lastName = dto.lName,
            birthday = dto.birthday,
            avatarUrl = dto.avatrUrl,
            speciality = SpecialityMapper().mapListDtoToListDbModel(dto.specialty)
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