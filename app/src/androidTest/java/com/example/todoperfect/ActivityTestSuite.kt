package com.example.todoperfect

import com.example.todoperfect.logic.dao.TaskDaoTest
import com.example.todoperfect.ui.AddActivityTest
import com.example.todoperfect.ui.EditTaskFragmentTest
import com.example.todoperfect.ui.MainActivityTest
import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    EditTaskFragmentTest::class,
    TaskDaoTest::class,
    AddActivityTest::class
)
class ActivityTestSuite