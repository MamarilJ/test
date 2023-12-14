package com.janraysapplication.app.modules.signup.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixtyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyValue: String? = null
)
