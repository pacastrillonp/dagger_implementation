package co.pacastrillonp.daggerimplementation.view

import androidx.lifecycle.ViewModel
import co.pacastrillonp.daggerimplementation.di.util.ViewModelKey
import co.pacastrillonp.daggerimplementation.viewmodel.ExampleOneViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ExampleOneModule {
    @Binds
    @IntoMap
    @ViewModelKey(ExampleOneViewModel::class)
    internal abstract fun bindExampleOneViewModel (viewModel: ExampleOneViewModel): ViewModel
}