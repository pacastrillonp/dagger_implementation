package co.pacastrillonp.daggerimplementation.di

import android.content.Context
import co.pacastrillonp.daggerimplementation.MainApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideApplicationContext(application: MainApplication): Context = application.applicationContext

}