package com.example.settings

import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter



@BindingAdapter("setName")
fun setName(tv: TextView,name: String?){
    if(name != null){
        tv.text = name
    }
}

@BindingAdapter("setColor")
fun setColor(tv: TextView,color: String?){
    if (color != null){
        setName(tv,color)
        when(color){
            "1" ->{tv.setTextColor(Color.RED)}
            "2" ->{tv.setTextColor(Color.BLUE)}
            "3" ->{tv.setTextColor(Color.GREEN)}
            else ->{}// unknown color
        }
    }

}

@BindingAdapter("notifyState")
fun notifyState(tv: TextView, b: Boolean?){
    if (b != null){
        if(b){
            setName(tv,"notify State: On")
        }else{
            setName(tv,"notify state: Off")
        }
    }
}

@BindingAdapter("notifySound")
fun notifySound(tv: TextView, b: Boolean?){
    if (b != null){
        if(b){
            setName(tv,"notify sound: On")
        }else{
            setName(tv,"notify sound: Off")
        }
    }
}