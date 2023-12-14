package com.janraysapplication.app.modules.dealsection.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.dealsection.`data`.model.DealSectionModel
import org.koin.core.KoinComponent

class DealSectionVM : ViewModel(), KoinComponent {
  val dealSectionModel: MutableLiveData<DealSectionModel> = MutableLiveData(DealSectionModel())

  var navArguments: Bundle? = null
}
