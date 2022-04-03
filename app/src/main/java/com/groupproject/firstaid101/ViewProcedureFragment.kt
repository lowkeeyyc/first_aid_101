package com.groupproject.firstaid101

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.groupproject.firstaid101.databinding.FragmentViewProcedureBinding

class ViewProcedureFragment : Fragment() {
    private val args: ViewProcedureFragmentArgs by navArgs()
    private val selectedProcedure by lazy {
        args.procedure
    }
    private lateinit var binding: FragmentViewProcedureBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentViewProcedureBinding.inflate(inflater, container, false)

        var steps = ""

        selectedProcedure.steps!!.split('/').forEach {
            steps += (it + "\n\n")

        }
        binding.apply {
            viewProcedureToolbar.title = selectedProcedure.name
            selectedProcedureSteps.text = steps

            viewProcedureToolbar.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.view_youtube->{
                        try {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(selectedProcedure.link))
                            Intent.createChooser(intent, "Open Youtube or browser")
                            startActivity(intent)
                        } catch (e: ActivityNotFoundException) {
                            Toast.makeText(requireContext(), e.message, Toast.LENGTH_LONG).show()
                        }
                        return@setOnMenuItemClickListener true
                    }

                    else -> return@setOnMenuItemClickListener false
                }
            }
        }

        return binding.root
    }



}