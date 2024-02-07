package com.example.composestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composestudy.ui.theme.ComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudyTheme {
                CountExp()
            }
        }
    }
}

@Composable
fun CountExp() {
    var count by remember {
        mutableStateOf(0)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = count.toString(),
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(24.dp)
                )
                Button(onClick = {
                    count++
                }) {
                    Text(
                        text = "Click Me",
                        fontSize = 32.sp
                    )
                }
            }
        }

        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f),
            contentAlignment = Alignment.BottomCenter) {
            Button(onClick = {
                /*TODO*/
            }) {
                Text(
                    text = "Proximo Exemplo ->",
                    fontSize = 26.sp
                )
            }
        }
    }
}


@Preview()
@Composable
fun Preview() {
    ComposeStudyTheme {
        CountExp()
    }
}
