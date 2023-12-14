package com.janraysapplication.app.modules.applicationrequestone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.applicationrequestone.`data`.model.ApplicationRequestOneModel
import org.koin.core.KoinComponent

class ApplicationRequestOneVM : ViewModel(), KoinComponent {
  val applicationRequestOneModel: MutableLiveData<ApplicationRequestOneModel> =
      MutableLiveData(ApplicationRequestOneModel())

  var navArguments: Bundle? = null
}
