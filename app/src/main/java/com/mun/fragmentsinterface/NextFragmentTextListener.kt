package com.mun.fragmentsinterface

class NextFragmentTextListener private constructor() {
    private var tvTextChangeCallback: TvTextChangeCallback? = null

    // Method to set the callback listener
    fun setTvTextChangeCallback(tvTextChangeCallback: TvTextChangeCallback?) {
        this.tvTextChangeCallback = tvTextChangeCallback
    }
    // Method to handle badge click and trigger the callback with the new parameters
    fun setTvChangedText(text:String) {
        tvTextChangeCallback?.onTvChangedText(text)
    }

    // Interface for the callback with updated parameters
    interface TvTextChangeCallback {
        fun onTvChangedText(text: String)
    }

    companion object {
        // Singleton instance
        @JvmStatic
        val instance: NextFragmentTextListener by lazy { NextFragmentTextListener() }
    }
}