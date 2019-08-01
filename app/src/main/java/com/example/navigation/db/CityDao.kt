package com.example.navigation.db

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Created by jiali on 2019-08-01.
 */
@Dao
interface CityDao {
    @Query("SELECT * FROM city ORDER BY name COLLATE NOCASE ASC")
    fun getAllCity(): DataSource.Factory<Int, City>

    @Insert
    fun insert(city: City)

    @Insert
    fun insert(cities: List<City>)
}