package com.todo.todotask.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.todo.todotask.navigation.destination.listComposable
import com.todo.todotask.navigation.destination.taskComposable
import com.todo.todotask.util.Constant.LIST_SCREEN

@Composable
fun SetupNavigation(navController: NavHostController) {
    val screen = remember(navController){
        Screens(navController  = navController)
    }

    NavHost(navController = navController, startDestination = LIST_SCREEN){
        listComposable {
            screen.taskId
        }

        taskComposable {
            screen.listAction
        }
    }
}