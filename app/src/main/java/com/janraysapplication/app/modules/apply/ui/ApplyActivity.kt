package com.janraysapplication.app.modules.apply.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityApplyBinding
import com.janraysapplication.app.modules.apply.`data`.viewmodel.ApplyVM
import com.janraysapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class ApplyActivity : BaseActivity<ActivityApplyBinding>(R.layout.activity_apply) {
  private val viewModel: ApplyVM by viewModels<ApplyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.applyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancel.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APPLY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ApplyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
