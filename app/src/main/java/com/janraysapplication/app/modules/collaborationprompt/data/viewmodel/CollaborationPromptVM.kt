package com.janraysapplication.app.modules.collaborationprompt.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.collaborationprompt.`data`.model.CollaborationPromptModel
import org.koin.core.KoinComponent

class CollaborationPromptVM : ViewModel(), KoinComponent {
  val collaborationPromptModel: MutableLiveData<CollaborationPromptModel> =
      MutableLiveData(CollaborationPromptModel())

  var navArguments: Bundle? = null
}
