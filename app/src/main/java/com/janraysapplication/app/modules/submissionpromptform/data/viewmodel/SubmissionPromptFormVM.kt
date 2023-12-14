package com.janraysapplication.app.modules.submissionpromptform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.submissionpromptform.`data`.model.SubmissionPromptFormModel
import org.koin.core.KoinComponent

class SubmissionPromptFormVM : ViewModel(), KoinComponent {
  val submissionPromptFormModel: MutableLiveData<SubmissionPromptFormModel> =
      MutableLiveData(SubmissionPromptFormModel())

  var navArguments: Bundle? = null
}
