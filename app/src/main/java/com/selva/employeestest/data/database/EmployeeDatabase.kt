package com.selva.employeestest.data.database

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [EmployeeDbModel::class, SpecialityDbModel::class], version = 1, exportSchema = false)
abstract class EmployeeDatabase: RoomDatabase() {

    abstract fun employeeDao(): EmployeeDao

    companion object {

        private var INSTANCE: EmployeeDatabase? = null
        private val LOCK = Any()
        private const val DB_NAME = "employee.db"

        fun getInstance(application: Application): EmployeeDatabase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    EmployeeDatabase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = db
                return db
            }
        }
    }
}