package com.example.alomtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alomtest.databinding.FragmentMypageBodyMeasurementEditmodeBinding
import com.example.alomtest.databinding.FragmentMypageHealthDetailBinding


class mypage_health_detail : Fragment() {
  private lateinit var binding:FragmentMypageHealthDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=FragmentMypageHealthDetailBinding.inflate(layoutInflater)
        binding.backiconBtn.setOnClickListener {
            replaceFragment(mypage_main())

        }
        binding.editModeIcon.setOnClickListener {
            replaceFragment(mypage_health_detail_editmode())

        }

    }

    private var _binding: FragmentMypageHealthDetailBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        _binding = FragmentMypageHealthDetailBinding.inflate(inflater,container,false)
        return binding.root
        //return inflater.inflate(R.layout.fragment_mypage_body_measurement_editmode, container, false)
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = parentFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
        println("success")
    }


    companion object {
    }
}