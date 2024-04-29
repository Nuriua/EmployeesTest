package com.selva.employeestest.presentation

import android.content.ClipData.newIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.selva.employeestest.R
import com.selva.employeestest.databinding.ActivityMainBinding
import com.selva.employeestest.domain.entity.Employee
import com.selva.employeestest.presentation.adapters.EmployeeAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        val adapter = EmployeeAdapter(this)
        binding.recyclerViewEmployees.adapter = adapter
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
//        viewModel.employeeList.observe(this) {
//            adapter.submitList(it)
//        }
    }

    private fun isOnePaneMode() = binding.employeeContainer == null

    private fun launchDetailActivity(id: Int) {
        val intent = EmployeeDetailActivity.newIntent(this, id)
        startActivity(intent)
    }

    private fun launchDetailFragment(id: Int) {
        supportFragmentManager.popBackStack()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.employee_container, EmployeeDetailFragment.newInstance(id))
            .addToBackStack(null)
            .commit()
    }
}