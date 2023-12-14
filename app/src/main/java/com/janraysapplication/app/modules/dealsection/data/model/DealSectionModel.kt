package com.janraysapplication.app.modules.dealsection.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DealSectionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKianStark: String? = MyApp.getInstance().resources.getString(R.string.lbl_kian_stark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHellothere: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_there)

)
