package com.selva.employeestest.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "specialities")
data class SpecialityDbModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val name: String?
)