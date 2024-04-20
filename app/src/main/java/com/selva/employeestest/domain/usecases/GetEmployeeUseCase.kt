package com.selva.employeestest.domain.usecases

import com.selva.employeestest.domain.EmployeeRepository

class GetEmployeeUseCase(
    private val repository: EmployeeRepository
) {

    operator fun invoke(id: Int?) = repository.getEmployee(id)
}