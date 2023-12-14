package com.janraysapplication.app.modules.communicationtaskdoerpov.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityCommunicationTaskDoerPovBinding
import com.janraysapplication.app.modules.communicationtaskdoerpov.`data`.viewmodel.CommunicationTaskDoerPovVM
import com.janraysapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class CommunicationTaskDoerPovActivity :
    BaseActivity<ActivityCommunicationTaskDoerPovBinding>(R.layout.activity_communication_task_doer_pov)
    {
  private val viewModel: CommunicationTaskDoerPovVM by viewModels<CommunicationTaskDoerPovVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.communicationTaskDoerPovVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImagesremovebg.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COMMUNICATION_TASK_DOER_POV_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CommunicationTaskDoerPovActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
