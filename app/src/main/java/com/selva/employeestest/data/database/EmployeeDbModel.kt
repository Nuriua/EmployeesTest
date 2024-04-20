package com.selva.employeestest.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.URL
import java.util.Date

@Entity(tableName = "employees")
data class EmployeeDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String?,
    val lastName: String?,
    val birthday: Date,
    val avatarUrl: URL,
    val specialty: SpecialityDbModel
)