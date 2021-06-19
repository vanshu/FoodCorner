package com.usfuchsia.foodcorner.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LauncherViewModel @Inject constructor() :ViewModel(){

}

sealed class LaunchNavigationAction{
    object NavigateToOnBoardingAction :LaunchNavigationAction()
    object NavigateToMainActivityAction: LaunchNavigationAction()
}