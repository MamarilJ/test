package com.janraysapplication.app.modules.profileratings.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileRatingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAeroPostle: String? = MyApp.getInstance().resources.getString(R.string.lbl_aero_postle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_id_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt192518829: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_2518_829)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCourse: String? = MyApp.getInstance().resources.getString(R.string.lbl_course)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_bsit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYearlevel: String? = MyApp.getInstance().resources.getString(R.string.lbl_year_level)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPortfolio: String? = MyApp.getInstance().resources.getString(R.string.lbl_portfolio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbertBing: String? = MyApp.getInstance().resources.getString(R.string.lbl_albert_bing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVeryFriendly: String? = MyApp.getInstance().resources.getString(R.string.msg_very_friendly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShellySion: String? = MyApp.getInstance().resources.getString(R.string.lbl_shelly_sion)

)
