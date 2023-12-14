package com.janraysapplication.app.modules.profileporfolio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityProfilePorfolioBinding
import com.janraysapplication.app.modules.applicationrequest.ui.ApplicationRequestActivity
import com.janraysapplication.app.modules.notification.ui.NotificationActivity
import com.janraysapplication.app.modules.profileporfolio.`data`.model.ListrectanglefortyoneRowModel
import com.janraysapplication.app.modules.profileporfolio.`data`.viewmodel.ProfilePorfolioVM
import com.janraysapplication.app.modules.profileratings.ui.ProfileRatingsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfilePorfolioActivity :
    BaseActivity<ActivityProfilePorfolioBinding>(R.layout.activity_profile_porfolio) {
  private val viewModel: ProfilePorfolioVM by viewModels<ProfilePorfolioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefortyoneAdapter =
    ListrectanglefortyoneAdapter(viewModel.listrectanglefortyoneList.value?:mutableListOf())
    binding.recyclerListrectanglefortyone.adapter = listrectanglefortyoneAdapter
    listrectanglefortyoneAdapter.setOnItemClickListener(
    object : ListrectanglefortyoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefortyoneRowModel) {
        onClickRecyclerListrectanglefortyone(view, position, item)
      }
    }
    )
    viewModel.listrectanglefortyoneList.observe(this) {
      listrectanglefortyoneAdapter.updateData(it)
    }
    binding.profilePorfolioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.image936342.setOnClickListener {
      val destIntent = ApplicationRequestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtRatings.setOnClickListener {
      val destIntent = ProfileRatingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.image1301304578not.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefortyone(
    view: View,
    position: Int,
    item: ListrectanglefortyoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_PORFOLIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfilePorfolioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
