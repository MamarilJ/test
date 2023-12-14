package com.janraysapplication.app.modules.submissionpromptformone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.submissionpromptformone.`data`.model.SubmissionPromptFormOneModel
import org.koin.core.KoinComponent

class SubmissionPromptFormOneVM : ViewModel(), KoinComponent {
  val submissionPromptFormOneModel: MutableLiveData<SubmissionPromptFormOneModel> =
      MutableLiveData(SubmissionPromptFormOneModel())

  var navArguments: Bundle? = null
}
