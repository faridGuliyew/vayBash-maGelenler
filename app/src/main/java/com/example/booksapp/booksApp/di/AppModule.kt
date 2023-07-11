package com.example.booksapp.booksApp.di

import com.example.booksapp.booksApp.data.remote.BookInfoApi
import com.example.booksapp.booksApp.data.repository.BookInfoRepositoryImpl
import com.example.booksapp.booksApp.domain.repository.BookInfoRepository
import com.example.booksapp.booksApp.domain.use_case.GetSearchResults
import com.example.booksapp.core.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideBookInfoApi() : BookInfoApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BookInfoApi::class.java)
    }

    @Singleton
    @Provides
    fun provideBookInfoRepository(bookInfoApi: BookInfoApi) : BookInfoRepository{
        return BookInfoRepositoryImpl(bookInfoApi)
    }

    //Use cases
    @Singleton
    @Provides
    fun provideGetSearchResultsUseCase(bookInfoRepository: BookInfoRepository) : GetSearchResults{
        return GetSearchResults(bookInfoRepository)
    }
}