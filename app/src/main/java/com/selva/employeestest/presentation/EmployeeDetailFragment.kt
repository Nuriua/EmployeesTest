package com.selva.employeestest.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.selva.employeestest.R

class EmployeeDetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_employee_detail, container, false)
    }

    companion object {

        private const val EXTRA_EMPLOYEE_ID = "extra_employee_id"

        fun newInstance(id: Int): EmployeeDetailFragment {
            return EmployeeDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(EXTRA_EMPLOYEE_ID, id)
                }
            }
        }
    }
}