package com.janraysapplication.app.modules.applicationrequest.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.applicationrequest.`data`.model.ApplicationRequestModel
import org.koin.core.KoinComponent

class ApplicationRequestVM : ViewModel(), KoinComponent {
  val applicationRequestModel: MutableLiveData<ApplicationRequestModel> =
      MutableLiveData(ApplicationRequestModel())

  var navArguments: Bundle? = null
}
