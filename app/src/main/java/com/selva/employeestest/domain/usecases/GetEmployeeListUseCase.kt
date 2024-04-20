package com.selva.employeestest.domain.usecases

import com.selva.employeestest.domain.EmployeeRepository
import com.selva.employeestest.domain.entity.Speciality

class GetEmployeeListUseCase(
    private val repository: EmployeeRepository
) {

    operator fun invoke(speciality: Speciality) = repository.getEmployeeList(speciality)
}