package com.janraysapplication.app.modules.notification.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKianStarkjust: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kian_stark_just)

)
