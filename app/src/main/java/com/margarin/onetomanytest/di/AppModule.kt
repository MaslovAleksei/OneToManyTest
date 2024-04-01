package com.margarin.onetomanytest.di

import android.content.Context
import androidx.room.Room
import com.margarin.onetomanytest.data.TestDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        TestDatabase::class.java,
        "TestDatabase"
    ).build()

    @Singleton
    @Provides
    fun provideContractDao(db: TestDatabase) = db.getContractDao()

    @Singleton
    @Provides
    fun provideWellDao(db: TestDatabase) = db.getWellDao()

    @Singleton
    @Provides
    fun provideViewPointsDao(db: TestDatabase) = db.getViewPointsDao()
}