package com.example.settings.screens

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.settings.R

class Settings : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }


}