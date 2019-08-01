package com.example.navigation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.navigation.db.CityDb

/**
 * Created by jiali on 2019-08-01.
 */
class CityViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = CityDb.get(application).cityDao()

    val allCities = LivePagedListBuilder(
        dao.getAllCity(), PagedList.Config.Builder()
            .setPageSize(PAGE_SIZE)
            .setEnablePlaceholders(ENABLE_PLACEHOLDERS)
            .setInitialLoadSizeHint(PAGE_SIZE)
            .build()
    ).build()

    companion object {
        private const val PAGE_SIZE = 15

        private const val ENABLE_PLACEHOLDERS = false
    }
}