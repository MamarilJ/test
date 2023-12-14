package com.janraysapplication.app.modules.createtask.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.createtask.`data`.model.CreateTaskModel
import org.koin.core.KoinComponent

class CreateTaskVM : ViewModel(), KoinComponent {
  val createTaskModel: MutableLiveData<CreateTaskModel> = MutableLiveData(CreateTaskModel())

  var navArguments: Bundle? = null
}
