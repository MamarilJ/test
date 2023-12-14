package com.janraysapplication.app.modules.mypost.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyPostModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferedtasks: String? = MyApp.getInstance().resources.getString(R.string.lbl_offered_tasks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKianStark: String? = MyApp.getInstance().resources.getString(R.string.lbl_kian_stark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJustnow: String? = MyApp.getInstance().resources.getString(R.string.lbl_just_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_150)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_looking_for_a_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeadline060: String? = MyApp.getInstance().resources.getString(R.string.msg_deadline_06_0)

)
