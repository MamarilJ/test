package com.janraysapplication.app.modules.enterinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.enterinfo.`data`.model.EnterInfoModel
import org.koin.core.KoinComponent

class EnterInfoVM : ViewModel(), KoinComponent {
  val enterInfoModel: MutableLiveData<EnterInfoModel> = MutableLiveData(EnterInfoModel())

  var navArguments: Bundle? = null
}
