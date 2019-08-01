package com.example.navigation.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by jiali on 2019-08-01.
 */
@Entity
data class City(@PrimaryKey(autoGenerate = true) val id: Int, val name: String)