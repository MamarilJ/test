package com.janraysapplication.app.modules.enterinfo.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EnterInfoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGcashnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_gcash_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountname: String? = MyApp.getInstance().resources.getString(R.string.lbl_account_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)
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
  var etGroupThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwoValue: String? = null
)
