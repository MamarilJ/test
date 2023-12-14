package com.janraysapplication.app.modules.profileratings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityProfileRatingsBinding
import com.janraysapplication.app.modules.notification.ui.NotificationActivity
import com.janraysapplication.app.modules.profileporfolio.ui.ProfilePorfolioActivity
import com.janraysapplication.app.modules.profileratings.`data`.viewmodel.ProfileRatingsVM
import kotlin.String
import kotlin.Unit

class ProfileRatingsActivity :
    BaseActivity<ActivityProfileRatingsBinding>(R.layout.activity_profile_ratings) {
  private val viewModel: ProfileRatingsVM by viewModels<ProfileRatingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileRatingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.image1301304578not.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtPortfolio.setOnClickListener {
      val destIntent = ProfilePorfolioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_RATINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileRatingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
