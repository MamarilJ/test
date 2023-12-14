package com.janraysapplication.app.modules.createtask.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityCreateTaskBinding
import com.janraysapplication.app.modules.createtask.`data`.viewmodel.CreateTaskVM
import com.janraysapplication.app.modules.mypost.ui.MyPostActivity
import kotlin.String
import kotlin.Unit

class CreateTaskActivity : BaseActivity<ActivityCreateTaskBinding>(R.layout.activity_create_task) {
  private val viewModel: CreateTaskVM by viewModels<CreateTaskVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createTaskVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPostTask.setOnClickListener {
      val destIntent = MyPostActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CREATE_TASK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateTaskActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
