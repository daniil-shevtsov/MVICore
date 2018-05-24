package com.badoo.mvicore.feature

import com.badoo.mvicore.element.Actor
import com.badoo.mvicore.element.Reducer

open class ActorReducerFeature<Wish : Any, in Effect : Any, State : Any>(
    initialState: State,
    actor: Actor<State, Wish, Effect>,
    reducer: Reducer<State, Effect>
) : DefaultFeature<Wish, Wish, Effect, State>(
    initialState = initialState,
    wishToAction = { wish -> wish },
    actor = actor,
    reducer = reducer
)