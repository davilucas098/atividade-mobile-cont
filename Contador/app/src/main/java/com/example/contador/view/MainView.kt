package com.example.contador.view

import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun MainView(modifier: Modifier = Modifier, viewModel: MainViewModel){

    val contador: Int by viewModel.contador.observeAsState(0)

    Column {
        Text(text = "=====================")
        Text(text = "=====================")
        Text(text = "=====================")
        Text(text = "=====================")
        Text(text = "=====================")
        TextField(value = "asdf", onValueChange = {})
        Button(onClick = { /*TODO*/}) {
            Text(text = "KKKK")
        }
    }
}