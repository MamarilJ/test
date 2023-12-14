package com.janraysapplication.app.modules.communicationtaskdoerpov.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.communicationtaskdoerpov.`data`.model.CommunicationTaskDoerPovModel
import org.koin.core.KoinComponent

class CommunicationTaskDoerPovVM : ViewModel(), KoinComponent {
  val communicationTaskDoerPovModel: MutableLiveData<CommunicationTaskDoerPovModel> =
      MutableLiveData(CommunicationTaskDoerPovModel())

  var navArguments: Bundle? = null
}
