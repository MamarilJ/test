package com.janraysapplication.app.modules.apply.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.apply.`data`.model.ApplyModel
import org.koin.core.KoinComponent

class ApplyVM : ViewModel(), KoinComponent {
  val applyModel: MutableLiveData<ApplyModel> = MutableLiveData(ApplyModel())

  var navArguments: Bundle? = null
}
