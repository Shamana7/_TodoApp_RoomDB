package com.harman.designcompose.todoapp_roomdb

import kotlin.jvm.java
import android.app.Application
import androidx.room.Room
import com.harman.designcompose.todoapp_roomdb.db.TodoDatabase

class MainApplication : Application() {

    companion object {
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(            // method that starts building your Room database class,it needs a context,databse,name
            applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.NAME
        ).build()
    }
}
