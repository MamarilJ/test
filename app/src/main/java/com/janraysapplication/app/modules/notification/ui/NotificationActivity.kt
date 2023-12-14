package com.janraysapplication.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.base.BaseActivity
import com.janraysapplication.app.databinding.ActivityNotificationBinding
import com.janraysapplication.app.modules.notification.`data`.model.NotificationRowModel
import com.janraysapplication.app.modules.notification.`data`.viewmodel.NotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val notificationAdapter =
    NotificationAdapter(viewModel.notificationList.value?:mutableListOf())
    binding.recyclerNotification.adapter = notificationAdapter
    notificationAdapter.setOnItemClickListener(
    object : NotificationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificationRowModel) {
        onClickRecyclerNotification(view, position, item)
      }
    }
    )
    viewModel.notificationList.observe(this) {
      notificationAdapter.updateData(it)
    }
    binding.notificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerNotification(
    view: View,
    position: Int,
    item: NotificationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
