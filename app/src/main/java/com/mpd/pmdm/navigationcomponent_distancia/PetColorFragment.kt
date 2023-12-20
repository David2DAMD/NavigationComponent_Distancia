package com.mpd.pmdm.navigationcomponent_distancia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.mpd.pmdm.navigationcomponent_distancia.databinding.FragmentPetColorBinding


class PetColorFragment : Fragment() {
    private var _binding: FragmentPetColorBinding? = null
    private val binding get() = _binding!!

    private val args: PetColorFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPetColorBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvPetTitle.text = getString(R.string.welcome_name_title, args.nombre)
    }

}