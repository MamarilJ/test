package com.janraysapplication.app.modules.uploadqr.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UploadQrModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_qr_here)
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
  var txtWITHDRAW: String? = MyApp.getInstance().resources.getString(R.string.lbl_withdraw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
