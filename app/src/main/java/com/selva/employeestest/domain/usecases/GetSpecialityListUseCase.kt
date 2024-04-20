package com.selva.employeestest.domain.usecases

import com.selva.employeestest.domain.EmployeeRepository

class GetSpecialityListUseCase(
    private val repository: EmployeeRepository
) {

    operator fun invoke() = repository.getSpecialityList()
}