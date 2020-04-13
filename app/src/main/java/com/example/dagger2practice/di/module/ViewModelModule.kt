package com.example.dagger2practice.di.module

import androidx.lifecycle.ViewModel
import com.example.dagger2practice.MainViewModel
import com.example.dagger2practice.di.annotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel : MainViewModel) : ViewModel
}