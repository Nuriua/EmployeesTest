package com.selva.employeestest.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EmployeeResponseDto {
    @SerializedName("response")
    @Expose
    var employeeList: List<EmployeeDto>? = null
}