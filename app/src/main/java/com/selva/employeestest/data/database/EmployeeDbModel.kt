package com.selva.employeestest.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.URL
import java.util.Date

@Entity(tableName = "employee")
data class EmployeeDbModel(
    val name: String?,
    val lastName: String?,
    val birthday: String?,
    val avatarUrl: String?,
    val speciality: List<SpecialityDbModel>?
)