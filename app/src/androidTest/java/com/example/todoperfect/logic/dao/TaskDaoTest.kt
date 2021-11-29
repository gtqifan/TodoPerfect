package com.example.todoperfect.logic.dao

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.todoperfect.logic.model.Task
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.sql.Timestamp
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import kotlin.concurrent.thread

@RunWith(AndroidJUnit4::class)
@SmallTest
class TaskDaoTest {
    private lateinit var database: AppDatabase
    private lateinit var dao: TaskDao


    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java
        ).allowMainThreadQueries().build()
        dao = database.taskDao()
    }

    @After
    fun teardown() {
        database.close()
    }

    @Test
    fun insertTaskTest() {
        val task = Task("Write test", "Test Room database",
            1, 30, Timestamp(2020101010101010), 2, true)
        dao.insertTask(task)
        val allTasks = dao.loadAllTasks()
        assertThat(allTasks).contains(task)
    }

    @Test
    fun updateTaskTest() {
        runBlocking {
            var task = Task("Write test", "Test Room database",
                1, 30, Timestamp(2020101010101010), 2, false)
            dao.insertTask(task)
            task.description = "updated"
            dao.updateTask(task)
            val allTasks = dao.loadAllTasks()
            assertThat(allTasks).doesNotContain(task)
        }
    }

    @Test
    fun deleteTaskTest() {
        val task = Task("Write test", "Test Room database",
            1, 30, Timestamp(2020101010101010), 2, true)
        dao.deleteTask(task)
        val allTasks = dao.loadAllTasks()
        assertThat(allTasks).doesNotContain(task)
    }
}