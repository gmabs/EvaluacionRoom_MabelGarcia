package com.example.miproyectofinal.db
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblUser")
data class userEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id : Int = 0 ,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "phone") val phone: String?,
    @ColumnInfo(name = "pais") val pais: String?
)