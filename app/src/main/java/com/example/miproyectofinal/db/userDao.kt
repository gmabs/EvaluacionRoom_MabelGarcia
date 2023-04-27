package com.example.miproyectofinal.db

import androidx.room.*

@Dao
interface userDao {
    @Query("SELECT * FROM tblUser ORDER BY id DESC")
    fun getAllUserInfo(): List<UserEntity>?

    @Insert
    fun insertUser(user: UserEntity?)

    @Delete
    fun deleteUser(user: UserEntity?)

    @Update
    fun updateUser(user: UserEntity?)

}