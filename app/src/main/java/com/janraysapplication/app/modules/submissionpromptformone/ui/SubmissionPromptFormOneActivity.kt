package com.janraysapplication.app.modules.submissionpromptformone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivitySubmissionPromptFormOneBinding
import com.janraysapplication.app.modules.notification.ui.NotificationActivity
import com.janraysapplication.app.modules.submissionpromptformone.`data`.viewmodel.SubmissionPromptFormOneVM
import kotlin.String
import kotlin.Unit

class SubmissionPromptFormOneActivity :
    BaseActivity<ActivitySubmissionPromptFormOneBinding>(R.layout.activity_submission_prompt_form_one)
    {
  private val viewModel: SubmissionPromptFormOneVM by viewModels<SubmissionPromptFormOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.submissionPromptFormOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCloseiconTwo.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUBMISSION_PROMPT_FORM_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SubmissionPromptFormOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
