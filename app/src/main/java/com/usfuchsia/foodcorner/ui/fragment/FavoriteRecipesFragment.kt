package com.usfuchsia.foodcorner.ui.fragment

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.usfuchsia.foodcorner.R
import com.usfuchsia.foodcorner.databinding.FragmentFavoriteRecipesBinding

class FavoriteRecipesFragment : Fragment() {

    lateinit var binding: FragmentFavoriteRecipesBinding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteRecipesBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvVersionName.text = activity?.let { getVersionName(it.applicationContext) }

    }

    private fun getVersionName(context: Context): String {
        var versionName: String
        try {
            versionName = context.packageManager.getPackageInfo(context.packageName, 0).versionName
        } catch (e: PackageManager.NameNotFoundException) {
            return ""
        }
        return versionName
    }

}