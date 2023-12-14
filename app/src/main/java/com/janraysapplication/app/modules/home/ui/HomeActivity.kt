package com.janraysapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityHomeBinding
import com.janraysapplication.app.modules.apply.ui.ApplyActivity
import com.janraysapplication.app.modules.createtask.ui.CreateTaskActivity
import com.janraysapplication.app.modules.dealsection.ui.DealSectionActivity
import com.janraysapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.janraysapplication.app.modules.mypost.ui.MyPostActivity
import com.janraysapplication.app.modules.uploadqr.ui.UploadQrActivity
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePngtreedealic.setOnClickListener {
      val destIntent = DealSectionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtMyposts.setOnClickListener {
      val destIntent = MyPostActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnApply.setOnClickListener {
      val destIntent = ApplyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.image8660951.setOnClickListener {
      val destIntent = UploadQrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.image3512861removeb.setOnClickListener {
      val destIntent = CreateTaskActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
