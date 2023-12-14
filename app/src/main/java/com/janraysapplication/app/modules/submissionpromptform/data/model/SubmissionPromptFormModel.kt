package com.janraysapplication.app.modules.submissionpromptform.`data`.model

import com.janraysapplication.app.R
import com.janraysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SubmissionPromptFormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPhpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_150)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_looking_for_a_s3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeadline060: String? = MyApp.getInstance().resources.getString(R.string.msg_deadline_06_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAPPLY: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)
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
  var txtKimTiu: String? = MyApp.getInstance().resources.getString(R.string.lbl_kim_tiu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hour_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollab: String? = MyApp.getInstance().resources.getString(R.string.lbl_collab2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDEALS: String? = MyApp.getInstance().resources.getString(R.string.lbl_deals)
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
  var txtPhpCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_300)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUrmovieprojec: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ur_movie_projec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeadline061: String? = MyApp.getInstance().resources.getString(R.string.msg_deadline_06_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferedtasks: String? = MyApp.getInstance().resources.getString(R.string.lbl_offered_tasks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyposts: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmissionSucc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_submission_succ)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.msg_it_will_take_1)

)
