package com.janraysapplication.app.modules.withdraw.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WithdrawModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_the_qr_you_sent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDepositedby: String? = MyApp.getInstance().resources.getString(R.string.lbl_deposited_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_kian_stark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFEED: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_create_a_post)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDEALS: String? = MyApp.getInstance().resources.getString(R.string.lbl_deals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWITHDRAWOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_withdraw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
