package com.example.notesapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.sql.StatementEvent

@Entity(tableName = "notesTable")
class Note(
    @ColumnInfo(name = "title") val noteTitle:String,
    @ColumnInfo(name = "description") val noteDescription: String,
    @ColumnInfo(name = "timeStamp") val timeStamp:String
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}