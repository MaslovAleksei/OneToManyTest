package com.margarin.onetomanytest

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.margarin.onetomanytest.data.ContractDao
import com.margarin.onetomanytest.data.ViewPointDao
import com.margarin.onetomanytest.data.WellDao
import com.margarin.onetomanytest.data.models.Contract
import com.margarin.onetomanytest.data.models.ViewPoint
import com.margarin.onetomanytest.data.models.Well
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    wellDao: WellDao,
    private val contractDao: ContractDao,
    viewPointDao: ViewPointDao
) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            wellDao.insertWell(
                Well(
                    "qwerty",
                    "1234567",
                    88
                )
            )
            wellDao.insertWell(
                Well(
                    "rtyu",
                    "1234567",
                    88
                )
            )
            wellDao.insertWell(
                Well(
                    "qweqytwyryerty",
                    "1234567",
                    88
                )
            )
            wellDao.insertWell(
                Well(
                    "qwerty",
                    "1234567",
                    88
                )
            )
            viewPointDao.insertViewPoint(
                ViewPoint(
                    "1111",
                    "qweqytwyryerty",
                    456
                )
            )
            viewPointDao.insertViewPoint(
                ViewPoint(
                    "22222",
                    "qweqytwyryerty",
                    7463
                )
            )
            viewPointDao.insertViewPoint(
                ViewPoint(
                    "0000",
                    "qwerty",
                    45743586
                )
            )
            contractDao.insertContract(
                Contract(
                    "1234567",
                    100
                )
            )
        }
    }

    fun test() {
        viewModelScope.launch(Dispatchers.IO) {
            contractDao.getAllContracts().collect {
                Log.d("tag", "getAllContracts: $it ")
            }
        }
    }
}