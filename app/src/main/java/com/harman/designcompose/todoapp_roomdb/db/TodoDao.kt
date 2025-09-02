package com.harman.designcompose.todoapp_roomdb.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.harman.designcompose.todoapp_roomdb.Todo

@Dao
interface TodoDao {

    @Query("SELECT * FROM Todo ORDER BY createdAt DESC")        //Later, when I want the data, Room runs a query and gives me back the object.
    fun getAllTodo() : LiveData<List<Todo>>                 //Room converts my @Dao methods into SQL SELECT queries and maps the results back into Kotlin objects.

    @Insert
    fun addTodo(todo : Todo)        //Room converts todo into sql query insert and Executes that query on an SQLite database file stored in the app’s internal storage.


    @Query("Delete FROM Todo where id = :id")
    fun deleteTodo(id : Int)

}