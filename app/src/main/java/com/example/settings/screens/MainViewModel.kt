package com.example.settings.screens

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.preference.PreferenceManager
import com.example.settings.CustomSettings
import com.example.settings.User

class MainViewModel(application: Application): AndroidViewModel(application) {


    private val _settings = MutableLiveData<CustomSettings>()
    val settings: LiveData<CustomSettings> = _settings



    fun loadSettings(context: Context) {
        val pref = PreferenceManager.getDefaultSharedPreferences(context)
        val name = pref.getString("name","")
        val email = pref.getString("gmail","")
        val age = pref.getInt("age",0)
        val color = pref.getString("color","1") // we set defValue 1 for 1st color in list
        val notifyState = pref.getBoolean("notifyState",true)
        val notifySound = pref.getBoolean("notifySound",false)

        val user = User(name,email)
        _settings.value = CustomSettings(user,color,notifyState,notifySound)


    }




    override fun onCleared() {
        super.onCleared()
    }


}