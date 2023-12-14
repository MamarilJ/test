package com.janraysapplication.app.modules.mypost.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.mypost.`data`.model.MyPostModel
import org.koin.core.KoinComponent

class MyPostVM : ViewModel(), KoinComponent {
  val myPostModel: MutableLiveData<MyPostModel> = MutableLiveData(MyPostModel())

  var navArguments: Bundle? = null
}
