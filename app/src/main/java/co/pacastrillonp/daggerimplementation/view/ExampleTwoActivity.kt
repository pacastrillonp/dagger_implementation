package co.pacastrillonp.daggerimplementation.view

import android.os.Bundle
import co.pacastrillonp.daggerimplementation.R
import dagger.android.support.DaggerAppCompatActivity

class ExampleTwoActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_two)
    }
}
