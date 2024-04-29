package com.selva.employeestest.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.selva.employeestest.data.repository.EmployeeRepositoryImpl
import com.selva.employeestest.domain.usecases.GetEmployeeListUseCase
import com.selva.employeestest.domain.usecases.GetEmployeeUseCase

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = EmployeeRepositoryImpl(application)

    private val getEmployeeListUseCase = GetEmployeeListUseCase(repository)
    private val getEmployeeUseCase = GetEmployeeUseCase(repository)
//    private val loadDataUseCase = LoadDataUseCase(repository)

    val employeeList = getEmployeeListUseCase()

//    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

//    init {
//        loadDataUseCase()
//    }
}