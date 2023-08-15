package com.example.examanndroid

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [productmodel::class], version = 0)
abstract class product : RoomDatabase() {

    companion object{
        fun getinstane(context: Context): product {
            var db=Room.databaseBuilder(context,product::class.java,"products")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
            return db

        }
    }
    abstract fun product():productDao
}