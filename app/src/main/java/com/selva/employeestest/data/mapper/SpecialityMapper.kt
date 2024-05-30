package com.selva.employeestest.data.mapper

import com.selva.employeestest.data.network.model.SpecialityDto
import com.selva.employeestest.domain.entity.Speciality

class SpecialityMapper {

    fun mapDtoToEntity(dto: SpecialityDto): Speciality {
        return Speciality(
            id = dto.specialtyId,
            name = dto.name
        )
    }

//    fun mapListDtoToListDbModel(dto: List<SpecialityDto>?) = dto?.map {
//        mapDtoToDbModel(it)
//    }
//
//    fun mapListDbModelToListEntity(dbModel: List<SpecialityDbModel>?) = dbModel?.map {
//        mapDbModelToEntity(it)
//    }
}