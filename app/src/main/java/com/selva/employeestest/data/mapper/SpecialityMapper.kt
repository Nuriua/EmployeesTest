package com.selva.employeestest.data.mapper

import com.selva.employeestest.data.database.SpecialityDbModel
import com.selva.employeestest.data.network.model.SpecialityDto
import com.selva.employeestest.domain.entity.Speciality

class SpecialityMapper {

    fun mapDtoToDbModel(dto: SpecialityDto): SpecialityDbModel {
        return SpecialityDbModel(
            id = dto.specialtyId,
            name = dto.name
        )
    }

    fun mapListDtoToListDbModel(dto: List<SpecialityDto>?) = dto?.map {
        mapDtoToDbModel(it)
    }

    fun mapDbModelToEntity(dbModel: SpecialityDbModel): Speciality {
        return Speciality(
            id = dbModel.id,
            name = dbModel.name
        )
    }

    fun mapListDbModelToListEntity(dbModel: List<SpecialityDbModel>?) = dbModel?.map {
        mapDbModelToEntity(it)
    }
}