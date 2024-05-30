package com.selva.employeestest.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.selva.employeestest.data.repository.EmployeeRepositoryImpl
import com.selva.employeestest.domain.entity.Employee
import com.selva.employeestest.domain.usecases.GetEmployeeListUseCase
import kotlinx.coroutines.launch

class MainViewModel(): ViewModel() {

    private val repository = EmployeeRepositoryImpl()

    private val getEmployeeListUseCase = GetEmployeeListUseCase(repository)

    private val _employeeList = MutableLiveData<List<Employee?>>()
    val employeeList: LiveData<List<Employee?>> = _employeeList

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    init {
        fetchEmployeeList()
    }

    private fun fetchEmployeeList() {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                val employeeListResult = getEmployeeListUseCase()
                _employeeList.value = employeeListResult
            } catch (e: Exception) {
                Log.e("FetchEmployeeList", "An error occurred", e)
            } finally {
                _isLoading.value = false
            }
        }
    }
}
