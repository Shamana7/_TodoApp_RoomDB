package com.harman.designcompose.todoapp_roomdb.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.harman.designcompose.todoapp_roomdb.Todo


@Database(entities = [Todo::class], version = 1)    //Tells Room to create a database with a table based on the Todo data class.
@TypeConverters(Converters::class)
abstract class TodoDatabase : RoomDatabase(){

    companion object {
        const val NAME = "Todo_DB"
    }

    abstract fun getTodoDao() : TodoDao  // TodoDao is RETURN TYPE not inheritance & also provides access to it

}