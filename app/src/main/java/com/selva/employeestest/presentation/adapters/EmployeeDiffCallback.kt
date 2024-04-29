package com.selva.employeestest.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import com.selva.employeestest.domain.entity.Employee

object EmployeeDiffCallback : DiffUtil.ItemCallback<Employee>() {

    override fun areItemsTheSame(oldItem: Employee, newItem: Employee): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Employee, newItem: Employee): Boolean {
        return oldItem == newItem
    }
}