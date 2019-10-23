package com.example.ankotest.layout.activity

import org.jetbrains.anko.*
import com.example.ankotest.MainActivity
import com.example.ankotest.R

class MainActivityUI: AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        if (ctx.getString(R.string.portland)=="landscape") createViewLand(ui)
        else createViewPort(ui)
    }

    private fun createViewPort(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            textView(R.string.this_is_basic_example)
            imageView(R.drawable.koi)
        }
    }

    private fun createViewLand(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            textView("Same thing but this is landscape based on the variable in strings")
            textView(R.string.this_is_basic_example)
            imageView(R.drawable.koi)
        }
    }

}