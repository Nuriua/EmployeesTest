package com.selva.employeestest.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.selva.employeestest.databinding.EmployeeItemBinding
import com.selva.employeestest.domain.entity.Employee

class EmployeeAdapter(
    private val context: Context
) : ListAdapter<Employee, EmployeeViewHolder>(EmployeeDiffCallback) {

    var onEmployeeClickListener: OnEmployeeClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val binding = EmployeeItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return EmployeeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee = getItem(position)
        with(holder.binding) {
            with(employee) {
                textViewName.text = name
                textViewLastName.text = lastName
                root.setOnClickListener {
                    onEmployeeClickListener?.onEmployeeClick(this)
                }
            }
        }
    }

    interface OnEmployeeClickListener {
        fun onEmployeeClick(employee: Employee)
    }
}