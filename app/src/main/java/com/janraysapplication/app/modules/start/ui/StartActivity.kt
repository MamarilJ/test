package com.janraysapplication.app.modules.start.ui

import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityStartBinding
import com.janraysapplication.app.modules.login.ui.LogInActivity
import com.janraysapplication.app.modules.signup.ui.SignUpActivity
import com.janraysapplication.app.modules.start.`data`.viewmodel.StartVM
import kotlin.String
import kotlin.Unit

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
  private val viewModel: StartVM by viewModels<StartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogIn.setOnClickListener {
      val destIntent = LogInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "START_ACTIVITY"

  }
}
