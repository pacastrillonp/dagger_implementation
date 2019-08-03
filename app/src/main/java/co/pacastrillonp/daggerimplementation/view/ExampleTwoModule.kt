package co.pacastrillonp.daggerimplementation.view

import androidx.lifecycle.ViewModel
import co.pacastrillonp.daggerimplementation.di.util.ViewModelKey
import co.pacastrillonp.daggerimplementation.viewmodel.ExampleTwoViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ExampleTwoModule {
    @Binds
    @IntoMap
    @ViewModelKey(ExampleTwoViewModel::class)
    internal abstract fun bindExampleTwoViewModel(viewModel: ExampleTwoViewModel): ViewModel
}