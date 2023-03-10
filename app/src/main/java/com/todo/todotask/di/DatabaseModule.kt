package com.todo.todotask.di

import android.content.Context
import androidx.room.Room
import com.todo.todotask.data.AppDatabase
import com.todo.todotask.util.Constant.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
        .build()

    @Singleton
    @Provides
    fun provideTodoDao(database: AppDatabase) = database.todoDao()
}