package com.janraysapplication.app.modules.dealsection.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityDealSectionBinding
import com.janraysapplication.app.modules.communicationtaskdoerpov.ui.CommunicationTaskDoerPovActivity
import com.janraysapplication.app.modules.dealsection.`data`.viewmodel.DealSectionVM
import kotlin.String
import kotlin.Unit

class DealSectionActivity : BaseActivity<ActivityDealSectionBinding>(R.layout.activity_deal_section)
    {
  private val viewModel: DealSectionVM by viewModels<DealSectionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dealSectionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowellipsethree.setOnClickListener {
      val destIntent = CommunicationTaskDoerPovActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DEAL_SECTION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DealSectionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
