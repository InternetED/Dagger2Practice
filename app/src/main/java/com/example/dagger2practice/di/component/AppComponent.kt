package com.example.dagger2practice.di.component

import android.app.Application
import com.example.dagger2practice.App
import com.example.dagger2practice.di.module.ActivityModule
import com.example.dagger2practice.di.module.AppModule
import com.example.dagger2practice.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,
AppModule::class,
ActivityModule::class,
ViewModelModule::class])
interface AppComponent : AndroidInjector<App>{

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application) : Builder
        fun build():AppComponent
    }

    override fun inject(instance: App?)
}