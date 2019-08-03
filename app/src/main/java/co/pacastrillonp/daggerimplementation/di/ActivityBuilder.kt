package co.pacastrillonp.daggerimplementation.di

import co.pacastrillonp.daggerimplementation.di.util.ActivityScoped
import co.pacastrillonp.daggerimplementation.view.ExampleOneActivity
import co.pacastrillonp.daggerimplementation.view.ExampleOneModule
import co.pacastrillonp.daggerimplementation.view.ExampleTwoActivity
import co.pacastrillonp.daggerimplementation.view.ExampleTwoModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [ExampleOneModule::class])
    internal abstract fun ExampleOneActivity(): ExampleOneActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = [ExampleTwoModule::class])
    internal abstract fun ExampleTwoActivity(): ExampleTwoActivity

}