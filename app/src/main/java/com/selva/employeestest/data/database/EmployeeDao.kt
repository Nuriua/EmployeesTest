package com.selva.employeestest.data.database

import androidx.room.Dao
import androidx.room.Query
import com.selva.employeestest.domain.entity.Employee
import com.selva.employeestest.domain.entity.Speciality

@Dao
interface EmployeeDao {

    @Query("SELECT * FROM employees ORDER BY name")
    fun getAllEmployees(): List<Employee>

    @Query("SELECT * FROM specialities ORDER BY name")
    fun getAllSpecialities(): List<Speciality>

    @Query("SELECT * FROM employees WHERE id=:employeeId LIMIT 1")
    fun getEmployee(employeeId: Int): Employee

    @Query("SELECT * FROM specialities WHERE id=:specialityId LIMIT 1")
    fun getSpeciality(specialityId: Int): Speciality
}