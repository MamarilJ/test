package com.janraysapplication.app.modules.withdraw.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.withdraw.`data`.model.WithdrawModel
import org.koin.core.KoinComponent

class WithdrawVM : ViewModel(), KoinComponent {
  val withdrawModel: MutableLiveData<WithdrawModel> = MutableLiveData(WithdrawModel())

  var navArguments: Bundle? = null
}
