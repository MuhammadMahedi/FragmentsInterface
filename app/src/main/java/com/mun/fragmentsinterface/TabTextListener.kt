package com.mun.fragmentsinterface

class TabTextListener private constructor() {
    private var textChangeCallback: TextChangeCallback? = null

    // Method to set the callback listener
    fun setTextChangeCallback(textChangeCallback: TextChangeCallback?) {
        this.textChangeCallback = textChangeCallback
    }
    // Method to handle badge click and trigger the callback with the new parameters
    fun setChangedText(text:String) {
        textChangeCallback?.onChangedText(text)
    }

    // Interface for the callback with updated parameters
    interface TextChangeCallback {
        fun onChangedText(text: String)
    }

    companion object {
        // Singleton instance
        @JvmStatic
        val instance: TabTextListener by lazy { TabTextListener() }
    }
}