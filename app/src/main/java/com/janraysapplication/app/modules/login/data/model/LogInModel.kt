package com.janraysapplication.app.modules.login.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LogInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyTwoValue: String? = null
)
