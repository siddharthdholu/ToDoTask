package com.todo.todotask.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.todo.todotask.util.Action
import com.todo.todotask.util.Constant

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = Constant.TASK_SCREEN,
        arguments = listOf(navArgument(Constant.TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ) {

    }
}