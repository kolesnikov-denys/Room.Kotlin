package com.example.roomkotlin

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}