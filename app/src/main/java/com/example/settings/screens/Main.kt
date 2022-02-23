package com.example.settings.screens


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.settings.R
import com.example.settings.databinding.MainWindowFragmentBinding

class Main : Fragment() {

    private lateinit var binding: MainWindowFragmentBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.main_window_fragment,container,false)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        binding.apply {

            binding.settingViewModel = viewModel
            binding.lifecycleOwner = this@Main


            viewModel.loadSettings(requireContext())

            // button_settings
            btnSettings.setOnClickListener{
                findNavController().navigate(R.id.action_main_window_to_settingsFragment)
            }





        }


        return binding.root
    }



//
//    private fun loadSettings(){
//        val pref = PreferenceManager.getDefaultSharedPreferences(requireContext())
//        val name = pref.getString("name","")
//        val gmail = pref.getString("gmail","")
//
//        val color = pref.getString("color","1") // we set defValue 1 for 1st color in list
//        val notifyState = pref.getBoolean("notifyState",true)
//        val notifySound = pref.getBoolean("notifySound",false)
//
//
//        try {
//            binding.userName.text = name
//            binding.userGmail.text = gmail
//
//            when(color){
//
//                "1"->{
//                    binding.userColor.text = "Red"
//                    binding.userColor.setTextColor(Color.RED)
//                }
//                "2"->{
//                    binding.userColor.text = "Blue"
//                    binding.userColor.setTextColor(Color.BLUE)
//                }
//                "3"->{
//                    binding.userColor.text = "Green"
//                    binding.userColor.setTextColor(Color.GREEN)
//                }
//            }
//            if(notifyState){
//                binding.notifyState.text = "Notification is On"
//            }else{
//                binding.notifyState.text = "Notification is Off"
//            }
//
//            if(notifySound){
//                binding.notifySound.text = "Notification Sound is On"
//            }else{
//                binding.notifySound.text = "Notification Sound is Off"
//            }
//        }catch (e: Exception){
//            Log.i("settings",e.message.toString())
//        }
//




}