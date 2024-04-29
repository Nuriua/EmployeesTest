package com.selva.employeestest.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SpecialityDto {
    @SerializedName("specialty_id")
    @Expose
    var specialtyId = 0

    @SerializedName("name")
    @Expose
    var name: String? = null
}
