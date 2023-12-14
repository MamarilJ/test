package com.janraysapplication.app.modules.submissionpromptform.ui

import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivitySubmissionPromptFormBinding
import com.janraysapplication.app.modules.home.ui.HomeActivity
import com.janraysapplication.app.modules.submissionpromptform.`data`.viewmodel.SubmissionPromptFormVM
import kotlin.String
import kotlin.Unit

class SubmissionPromptFormActivity :
    BaseActivity<ActivitySubmissionPromptFormBinding>(R.layout.activity_submission_prompt_form) {
  private val viewModel: SubmissionPromptFormVM by viewModels<SubmissionPromptFormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.submissionPromptFormVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCloseiconTwo.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUBMISSION_PROMPT_FORM_ACTIVITY"

  }
}
