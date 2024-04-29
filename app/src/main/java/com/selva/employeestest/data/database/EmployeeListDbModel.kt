package com.selva.employeestest.data.database

import androidx.room.Entity
import com.selva.employeestest.data.network.model.EmployeeDto

@Entity(tableName = "employeeList")
data class EmployeeListDbModel(
    var employeeList: List<EmployeeDto>? = null
)