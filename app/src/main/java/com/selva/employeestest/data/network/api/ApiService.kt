package com.selva.employeestest.data.network.api

import com.selva.employeestest.data.network.model.EmployeeResponseDto
import retrofit2.http.GET

interface ApiService {
    @GET("testTask.json")
    suspend fun getEmployees(): EmployeeResponseDto
}