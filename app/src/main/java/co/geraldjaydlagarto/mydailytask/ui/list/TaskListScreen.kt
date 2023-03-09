package co.geraldjaydlagarto.mydailytask.ui.list

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TaskListScreen() {
    Scaffold(
        topBar = {
            TopBar()
        }
    ) {
        Content(
            modifier = Modifier.padding(it)
        )
    }
}

@Composable
private fun TopBar(modifier: Modifier = Modifier) {
    SmallTopAppBar(
        title = {
            Text(text = "Daily Tasks")
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add task")
            }
        }
    )
}

@Composable
private fun Content(modifier: Modifier = Modifier) {
    
}

