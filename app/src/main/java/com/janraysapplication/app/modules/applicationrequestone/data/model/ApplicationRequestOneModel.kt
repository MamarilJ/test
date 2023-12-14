package com.janraysapplication.app.modules.applicationrequestone.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ApplicationRequestOneModel(
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_form)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollaborateOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_collaborate2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonaLang: String? = MyApp.getInstance().resources.getString(R.string.lbl_dona_lang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ratings_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJulieBaker: String? = MyApp.getInstance().resources.getString(R.string.lbl_julie_baker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ratings_3_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_form)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJulieBakerOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_julie_baker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounterThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ratings_3_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_form)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonaLangOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_dona_lang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounterFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ratings_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_form)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccept: String? = MyApp.getInstance().resources.getString(R.string.lbl_accept)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcceptOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_accept)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_collab_with_aer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYes: String? = MyApp.getInstance().resources.getString(R.string.lbl_yes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)

)
