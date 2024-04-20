package com.selva.employeestest.domain.usecases

import com.selva.employeestest.domain.EmployeeRepository

class GetSpecialityUseCase(
    private val repository: EmployeeRepository
) {

    operator fun invoke(id: Int?) = repository.getSpeciality(id)
}