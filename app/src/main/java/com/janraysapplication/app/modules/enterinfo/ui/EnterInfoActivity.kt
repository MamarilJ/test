package com.janraysapplication.app.modules.enterinfo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityEnterInfoBinding
import com.janraysapplication.app.modules.enterinfo.`data`.viewmodel.EnterInfoVM
import com.janraysapplication.app.modules.submissionpromptformone.ui.SubmissionPromptFormOneActivity
import kotlin.String
import kotlin.Unit

class EnterInfoActivity : BaseActivity<ActivityEnterInfoBinding>(R.layout.activity_enter_info) {
  private val viewModel: EnterInfoVM by viewModels<EnterInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enterInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupOne.setOnClickListener {
      val destIntent = SubmissionPromptFormOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENTER_INFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnterInfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
