package com.janraysapplication.app.modules.uploadqr.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.uploadqr.`data`.model.UploadQrModel
import org.koin.core.KoinComponent

class UploadQrVM : ViewModel(), KoinComponent {
  val uploadQrModel: MutableLiveData<UploadQrModel> = MutableLiveData(UploadQrModel())

  var navArguments: Bundle? = null
}
