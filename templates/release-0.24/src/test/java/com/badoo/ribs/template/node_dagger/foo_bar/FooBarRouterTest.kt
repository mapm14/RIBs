package com.badoo.ribs.template.node_dagger.foo_bar

import com.badoo.ribs.core.modality.BuildParams
import com.badoo.ribs.routing.source.RoutingSource
import com.badoo.ribs.template.node_dagger.foo_bar.routing.FooBarChildBuilders
import com.badoo.ribs.template.node_dagger.foo_bar.routing.FooBarRouter
import com.nhaarman.mockitokotlin2.mock
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class FooBarRouterTest {

    private val buildParams: BuildParams<Nothing?> = mock()
    private val builder: FooBarChildBuilders = mock()
    private var router: FooBarRouter? = null

    @Before
    fun setup() {
        router = FooBarRouter(
            buildParams = buildParams,
            routingSource = RoutingSource.empty(),
            builders = builder
        )
    }

    @After
    fun tearDown() {
    }

    /**
     * TODO: Add real tests.
     */
    @Test
    fun `an example test with some conditions should pass`() {
        throw RuntimeException("Add real tests.")
    }
}
