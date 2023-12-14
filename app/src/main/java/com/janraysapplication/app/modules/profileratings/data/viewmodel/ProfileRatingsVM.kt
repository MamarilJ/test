package com.janraysapplication.app.modules.profileratings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.janraysapplication.app.modules.profileratings.`data`.model.ProfileRatingsModel
import org.koin.core.KoinComponent

class ProfileRatingsVM : ViewModel(), KoinComponent {
  val profileRatingsModel: MutableLiveData<ProfileRatingsModel> =
      MutableLiveData(ProfileRatingsModel())

  var navArguments: Bundle? = null
}
