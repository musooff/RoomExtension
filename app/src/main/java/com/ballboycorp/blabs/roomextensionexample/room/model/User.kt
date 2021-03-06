
package com.ballboycorp.blabs.roomextensionexample.room.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/**
 * Created by muso on 27/12/2018.
 */
@Entity(foreignKeys = [(ForeignKey(entity = School::class, parentColumns = arrayOf("students", "number"), childColumns = arrayOf("id", "name"), onDelete = ForeignKey.SET_DEFAULT, onUpdate = ForeignKey.RESTRICT))])
data class User(
    @PrimaryKey val id: Int,
    val name: String,
    val lastName: String?
)