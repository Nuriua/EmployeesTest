package com.selva.employeestest.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.selva.employeestest.data.database.EmployeeDatabase
import com.selva.employeestest.data.mapper.EmployeeMapper
import com.selva.employeestest.domain.EmployeeRepository
import com.selva.employeestest.domain.entity.Employee
import com.selva.employeestest.domain.entity.Speciality

class EmployeeRepositoryImpl(
    private val application: Application
    ) : EmployeeRepository {

    private val employeeDao = EmployeeDatabase.getInstance(application).employeeDao()
    private val mapper = EmployeeMapper()

    override fun getSpecialityList(): LiveData<List<Speciality>> {
        TODO("Not yet implemented")
    }

    override fun getEmployeeList(speciality: Speciality): LiveData<List<Employee>> {
        TODO("Not yet implemented")
    }

    override fun getSpeciality(id: Int?): LiveData<Speciality> {
        TODO("Not yet implemented")
    }

    override fun getEmployee(id: Int?): LiveData<Employee> {
        TODO("Not yet implemented")
    }
}
