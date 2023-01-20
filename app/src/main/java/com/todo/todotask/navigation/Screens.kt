package com.todo.todotask.navigation

import androidx.navigation.NavHostController
import com.todo.todotask.util.Action
import com.todo.todotask.util.Constant.LIST_SCREEN


class Screens(navController: NavHostController) {
    val listAction: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) {inclusive = true}
        }
    }

    val taskId: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}