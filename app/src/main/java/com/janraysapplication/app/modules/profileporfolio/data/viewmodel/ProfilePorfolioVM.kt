package com.janraysapplication.app.modules.profileporfolio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.profileporfolio.`data`.model.ListrectanglefortyoneRowModel
import com.janraysapplication.app.modules.profileporfolio.`data`.model.ProfilePorfolioModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfilePorfolioVM : ViewModel(), KoinComponent {
  val profilePorfolioModel: MutableLiveData<ProfilePorfolioModel> =
      MutableLiveData(ProfilePorfolioModel())

  var navArguments: Bundle? = null

  val listrectanglefortyoneList: MutableLiveData<MutableList<ListrectanglefortyoneRowModel>> =
      MutableLiveData(mutableListOf())
}
