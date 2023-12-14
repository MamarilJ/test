package com.janraysapplication.app.modules.collaborationprompt.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityCollaborationPromptBinding
import com.janraysapplication.app.modules.collaborationprompt.`data`.viewmodel.CollaborationPromptVM
import com.janraysapplication.app.modules.dealsection.ui.DealSectionActivity
import kotlin.String
import kotlin.Unit

class CollaborationPromptActivity :
    BaseActivity<ActivityCollaborationPromptBinding>(R.layout.activity_collaboration_prompt) {
  private val viewModel: CollaborationPromptVM by viewModels<CollaborationPromptVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.collaborationPromptVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCloseiconTwo.setOnClickListener {
      val destIntent = DealSectionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COLLABORATION_PROMPT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CollaborationPromptActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
