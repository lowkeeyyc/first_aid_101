package com.groupproject.firstaid101

import android.app.Notification
import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.groupproject.firstaid101.databinding.FragmentResultsBinding

class ResultsFragment : Fragment(),ResultsAdapter.OnItemCLickListener {
    private lateinit var binding : FragmentResultsBinding
    private lateinit var filteredResults:List<Procedure>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentResultsBinding.inflate(inflater,container,false)
        val searchString = arguments?.getString("search")
        val firebaseRef = Firebase.database.getReference("procedures")

        val queryResults = mutableListOf<Procedure>()
        binding.noResultsLayout.visibility = View.GONE



        firebaseRef.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.hasChildren()) {
                    snapshot.children.forEach {
                        val procedure = it.getValue<Procedure>()
                        if (procedure != null) {
                            queryResults.add(procedure)
                        }
                    }

                    filteredResults =  queryResults.filter { it.name!!.contains(searchString.toString(), ignoreCase = true) }

                    binding.apply {
                        val adapter = ResultsAdapter(this@ResultsFragment)
                        resultsRecyclerView.adapter = adapter
                        adapter.submitList(filteredResults)
                        if(filteredResults.isEmpty()){
                            binding.noResultsLayout.visibility = View.VISIBLE
                        }
                    }
                }else{
                    Log.v("MyFirebase","Data not found")
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(requireContext(),error.message,Toast.LENGTH_LONG).show()
            }

        })


        return binding.root
    }

    override fun onItemClick(position: Int) {
        val action = ResultsFragmentDirections.actionResultsFragmentToViewProcedureFragment(filteredResults[position])
        findNavController().navigate(action)
    }
}