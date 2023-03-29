package com.example.marvel

import android.os.Process
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.Button
import androidx.compose.material.Text


@Composable
fun ErrorMessage(){
    Text(
        text = "Нет подключения к интернету, не удалось загрузить данные!",
        modifier = Modifier.padding(
            start = 30.dp,
            top = 40.dp),
        style = TextStyle(
            color = Color.Black,
            fontSize = 35.sp)
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        Alignment.Center
    ) {
        Button(onClick = {
            Process.killProcess(Process.myPid())
        }) {
            Text(
                text = "Выход",
                style = TextStyle(color = Color.White)
            )
        }
    }
}