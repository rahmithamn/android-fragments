package org.rmn.androidtrivia


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.rmn.androidtrivia.databinding.FragmentGameOverBinding
import org.rmn.androidtrivia.databinding.FragmentGameWonBinding

/**
 * A simple [Fragment] subclass.
 */
class GameOverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentGameOverBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_over, container, false)
        binding.btnTryagain.setOnClickListener { view: View->
            view.findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
        return binding.root
    }


}
