package com.janraysapplication.app.modules.createtask.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreateTaskModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhattaskarey: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_task_are_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoteYouarer: String? = MyApp.getInstance().resources.getString(R.string.msg_note_you_are_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetthedeadlin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_the_deadlin)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupElevenValue: String? = null
)
