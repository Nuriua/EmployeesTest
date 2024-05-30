package com.selva.employeestest.domain.usecases

import com.selva.employeestest.domain.EmployeeRepository

class GetEmployeeListUseCase(
    private val repository: EmployeeRepository
) {

    suspend operator fun invoke() = repository.getEmployeeList()
}