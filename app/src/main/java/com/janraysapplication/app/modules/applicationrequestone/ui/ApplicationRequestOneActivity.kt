package com.janraysapplication.app.modules.applicationrequestone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityApplicationRequestOneBinding
import com.janraysapplication.app.modules.applicationrequest.ui.ApplicationRequestActivity
import com.janraysapplication.app.modules.applicationrequestone.`data`.viewmodel.ApplicationRequestOneVM
import com.janraysapplication.app.modules.collaborationprompt.ui.CollaborationPromptActivity
import kotlin.String
import kotlin.Unit

class ApplicationRequestOneActivity :
    BaseActivity<ActivityApplicationRequestOneBinding>(R.layout.activity_application_request_one) {
  private val viewModel: ApplicationRequestOneVM by viewModels<ApplicationRequestOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.applicationRequestOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtYes.setOnClickListener {
      val destIntent = CollaborationPromptActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtCancel.setOnClickListener {
      val destIntent = ApplicationRequestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APPLICATION_REQUEST_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ApplicationRequestOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
