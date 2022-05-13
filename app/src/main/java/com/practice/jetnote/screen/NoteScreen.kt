package com.practice.jetnote.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.practice.jetnote.R

@Composable
fun NoteScreen() {
    Column(modifier = Modifier.padding(6.dp)) {
        SmallTopAppBar(
            title = {
                Text(
                    text = stringResource(id = R.string.app_name)
                )
            }, actions = {
                Icon(
                    imageVector = Icons.Rounded.Notifications,
                    contentDescription = "Icon notify"
                )
            }//, colors = Color(0xFFDADFE3)
        )

        //Content
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }

    }
}

@Preview(showBackground = true)
@Composable
fun NotesScreenPreview() {
    NoteScreen()
}