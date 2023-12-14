package com.janraysapplication.app.modules.withdraw.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityWithdrawBinding
import com.janraysapplication.app.modules.enterinfo.ui.EnterInfoActivity
import com.janraysapplication.app.modules.withdraw.`data`.viewmodel.WithdrawVM
import kotlin.String
import kotlin.Unit

class WithdrawActivity : BaseActivity<ActivityWithdrawBinding>(R.layout.activity_withdraw) {
  private val viewModel: WithdrawVM by viewModels<WithdrawVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.withdrawVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnWithdraw.setOnClickListener {
      val destIntent = EnterInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WITHDRAW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WithdrawActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
