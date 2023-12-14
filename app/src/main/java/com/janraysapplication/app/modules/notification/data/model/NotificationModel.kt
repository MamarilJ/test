package com.janraysapplication.app.modules.notification.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWehavetransfe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_have_transfe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFEED: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_create_a_post)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDEALS: String? = MyApp.getInstance().resources.getString(R.string.lbl_deals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWITHDRAW: String? = MyApp.getInstance().resources.getString(R.string.lbl_withdraw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
