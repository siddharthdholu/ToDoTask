package com.todo.todotask.ui.screen.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.todo.todotask.ui.theme.topAppBarBackgroundColor
import com.todo.todotask.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar(){
    DefaultListAppBar()
}


@Composable
fun DefaultListAppBar(){
    TopAppBar(
        title = {
            Text(text = "Tasks", color = MaterialTheme.colors.topAppBarContentColor)
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Composable
@Preview
fun DefaultAppBarPreview(){
    DefaultListAppBar()
}