package com.appify.scaneye.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.appify.scaneye.MainViewModel
import com.appify.scaneye.R

class HistoryFragment : Fragment() {
    private val myMainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpStatusBar(); return inflater.inflate(R.layout.fragment_history, container, false)
    }

    private fun setUpStatusBar() {
        val currentWindow =
            activity?.window; currentWindow?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        currentWindow?.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)
        currentWindow?.navigationBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)

        if (currentWindow != null) {
            WindowCompat.setDecorFitsSystemWindows(currentWindow, false)
            WindowCompat.getInsetsController(currentWindow, currentWindow.decorView).apply {
                isAppearanceLightStatusBars = true
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}