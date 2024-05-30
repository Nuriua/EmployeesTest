package com.selva.employeestest.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.selva.employeestest.R
import com.selva.employeestest.databinding.ActivityMainBinding
import com.selva.employeestest.presentation.adapters.EmployeeAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val adapter = EmployeeAdapter()
        binding.recyclerViewEmployees.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewEmployees.adapter = adapter
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.employeeList.observe(this) {
            adapter.submitList(it)
        }
    }
}
