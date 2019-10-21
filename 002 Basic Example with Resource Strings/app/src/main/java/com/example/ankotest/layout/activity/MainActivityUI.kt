package com.example.ankotest.layout.activity

import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.listeners.onClick
import com.example.ankotest.MainActivity
import com.example.ankotest.R

class MainActivityUI: AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            textView(R.string.this_is_basic_example)
            button("When you click this button it will call a handler function in the Activity") {
                onClick {
                    (ctx as MainActivity).okBtnClicked()
                }
            }
        }
    }

}