package com.janraysapplication.app.modules.mypost.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityMyPostBinding
import com.janraysapplication.app.modules.applicationrequest.ui.ApplicationRequestActivity
import com.janraysapplication.app.modules.mypost.`data`.viewmodel.MyPostVM
import kotlin.String
import kotlin.Unit

class MyPostActivity : BaseActivity<ActivityMyPostBinding>(R.layout.activity_my_post) {
  private val viewModel: MyPostVM by viewModels<MyPostVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myPostVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnViewSubmissionsOne.setOnClickListener {
      val destIntent = ApplicationRequestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MY_POST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyPostActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
