package com.janraysapplication.app.modules.applicationrequest.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityApplicationRequestBinding
import com.janraysapplication.app.modules.applicationrequest.`data`.viewmodel.ApplicationRequestVM
import com.janraysapplication.app.modules.applicationrequestone.ui.ApplicationRequestOneActivity
import com.janraysapplication.app.modules.profileporfolio.ui.ProfilePorfolioActivity
import kotlin.String
import kotlin.Unit

class ApplicationRequestActivity :
    BaseActivity<ActivityApplicationRequestBinding>(R.layout.activity_application_request) {
  private val viewModel: ApplicationRequestVM by viewModels<ApplicationRequestVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.applicationRequestVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnViewForm.setOnClickListener {
      val destIntent = ProfilePorfolioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCollaborate.setOnClickListener {
      val destIntent = ApplicationRequestOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APPLICATION_REQUEST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ApplicationRequestActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
