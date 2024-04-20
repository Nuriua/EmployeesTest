package com.selva.employeestest.domain

import androidx.lifecycle.LiveData
import com.selva.employeestest.domain.entity.Employee
import com.selva.employeestest.domain.entity.Speciality

interface EmployeeRepository {

    fun getSpecialityList(): LiveData<List<Speciality>>

    fun getEmployeeList(speciality: Speciality): LiveData<List<Employee>>

    fun getSpeciality(id: Int?): LiveData<Speciality>

    fun getEmployee(id: Int?): LiveData<Employee>
}
