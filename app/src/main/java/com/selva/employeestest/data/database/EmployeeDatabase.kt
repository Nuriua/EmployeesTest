package com.selva.employeestest.data.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class EmployeeDatabase: RoomDatabase() {

    fun getInstance(context: Context) {

    }


}