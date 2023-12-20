package com.mpd.pmdm.navigationcomponent_distancia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.mpd.pmdm.navigationcomponent_distancia.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnTerminar.setOnClickListener {
            activity?.finish()
        }

        binding.btnContinuar.setOnClickListener {
            val sexo = when{
                binding.rbtHombre.isChecked -> "Hombre"
                binding.rbtMujer.isChecked -> "Mujer"
                else -> "Otro"
            }


            val action = HomeFragmentDirections.actionHomeFragmentToPetColorFragment(
                binding.editNombre.text.toString(),
                sexo
            )

            findNavController().navigate(action)
        }
    }


}