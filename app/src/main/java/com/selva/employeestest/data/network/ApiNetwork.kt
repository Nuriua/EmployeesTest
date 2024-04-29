package com.selva.employeestest.data.network

import retrofit2.http.GET

interface ApiService {
    @get:GET("testTask.json")
    val employees: Observable<EmployeeResponse?>?
}