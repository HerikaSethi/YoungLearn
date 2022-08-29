package com.herika.younglearn.di

import com.herika.younglearn.repository.DogsRepository
import com.herika.younglearn.repository.DogsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDogsRepository(): DogsRepository = DogsRepositoryImpl()
}
