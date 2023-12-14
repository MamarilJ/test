package com.janraysapplication.app.modules.applicationrequest.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ApplicationRequestModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCollabMates: String? = MyApp.getInstance().resources.getString(R.string.lbl_collabmates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmissionsThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_submissions_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAeroPostle: String? = MyApp.getInstance().resources.getString(R.string.lbl_aero_postle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_ratings_3_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJulieBaker: String? = MyApp.getInstance().resources.getString(R.string.lbl_julie_baker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ratings_3_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonaLang: String? = MyApp.getInstance().resources.getString(R.string.lbl_dona_lang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ratings_4)

)
