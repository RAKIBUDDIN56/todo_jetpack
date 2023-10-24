package com.example.jetpack_practice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview()
@Composable
fun QuoteListItem() {
    Card(elevation = 4.dp, modifier = Modifier.padding(8.dp)) {
        Row(modifier = Modifier.padding(16.dp)) {
            Text(text = "Sample text")
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text="Time is most valuable thing a man can spend", modifier = Modifier.padding(0.dp,0.dp,0.dp,1.dp))
                Box(modifier = Modifier.background(Color.Gray).fillMaxWidth(.4f).height(1.dp))
                Text(text="Theophrastus", style = MaterialTheme.typography.body2, fontWeight = FontWeight.Thin, modifier = Modifier.padding(4.dp))
            }
        }

    }
}
