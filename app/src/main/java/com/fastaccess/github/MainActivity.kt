package com.fastaccess.github

import android.os.Bundle
import com.fastaccess.github.base.BaseActivity
import timber.log.Timber

class MainActivity : BaseActivity() {

    override fun layoutRes(): Int = R.layout.login_form_layout

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Timber.e("here")
    }

    override fun onActivityCreatedWithUser(savedInstanceState: Bundle?) {
        Timber.e("here")
    }
}
