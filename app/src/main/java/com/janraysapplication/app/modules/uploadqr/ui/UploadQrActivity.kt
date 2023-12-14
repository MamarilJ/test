package com.janraysapplication.app.modules.uploadqr.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityUploadQrBinding
import com.janraysapplication.app.modules.uploadqr.`data`.viewmodel.UploadQrVM
import com.janraysapplication.app.modules.withdraw.ui.WithdrawActivity
import kotlin.String
import kotlin.Unit

class UploadQrActivity : BaseActivity<ActivityUploadQrBinding>(R.layout.activity_upload_qr) {
  private val viewModel: UploadQrVM by viewModels<UploadQrVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.uploadQrVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = WithdrawActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "UPLOAD_QR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UploadQrActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
