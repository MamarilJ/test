package com.janraysapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityLogInBinding
import com.janraysapplication.app.modules.home.ui.HomeActivity
import com.janraysapplication.app.modules.login.`data`.viewmodel.LogInVM
import kotlin.String
import kotlin.Unit

class LogInActivity : BaseActivity<ActivityLogInBinding>(R.layout.activity_log_in) {
  private val viewModel: LogInVM by viewModels<LogInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogIn.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOG_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
