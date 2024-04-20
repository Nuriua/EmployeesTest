package com.selva.employeestest.domain.entity

import com.selva.employeestest.data.database.SpecialityDbModel
import java.net.URL
import java.util.Date

data class Employee(
    val id: Int?,
    val name: String?,
    val lastName: String?,
    val birthday: Date,
    val avatarUrl: URL,
    val specialty: SpecialityDbModel
)