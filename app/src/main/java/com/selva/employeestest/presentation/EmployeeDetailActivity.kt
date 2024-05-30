package com.selva.employeestest.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.selva.employeestest.R
import com.selva.employeestest.databinding.ActivityEmployeeDetailBinding

class EmployeeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmployeeDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {

        private const val EXTRA_EMPLOYEE_ID = "extra_employee_id"

        fun newIntent(context: Context, employeeId: Int): Intent {
            val intent = Intent(context, EmployeeDetailActivity::class.java)
            intent.putExtra(EXTRA_EMPLOYEE_ID, employeeId)
            return intent
        }
    }
}