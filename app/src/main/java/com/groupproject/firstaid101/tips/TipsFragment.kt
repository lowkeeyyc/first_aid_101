package com.groupproject.firstaid101.tips

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.groupproject.firstaid101.R
import com.groupproject.firstaid101.databinding.FragmentTipsBinding

class TipsFragment : Fragment(R.layout.fragment_tips) {
    private lateinit var binding: FragmentTipsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTipsBinding.inflate(inflater, container, false)
        val firebaseRef = Firebase.database.getReference("Quick Health Tips")
        val tipsList = mutableListOf<Tip>()
        val adapter: TipsAdapter = TipsAdapter()
        binding.tipsRecyclerView.adapter = adapter
        firebaseRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.hasChildren()) {
                    snapshot.children.forEach {
                        val tip = it.getValue<Tip>()
                        if (tip != null) {
                            tipsList.add(tip)
                        }
                    }
                    adapter.submitList(tipsList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(requireContext(), error.message, Toast.LENGTH_LONG).show()
            }

        })
        binding.apply {
            searchTipsEdittextLayout.editText!!.addTextChangedListener(object:TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    //
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    val resultList = tipsList.filter { it.name!!.contains(p0.toString(),ignoreCase = true) }
                    adapter.submitList(resultList)
                }

                override fun afterTextChanged(p0: Editable?) {
                    //
                }

            })
            }

        return binding.root
    }
}