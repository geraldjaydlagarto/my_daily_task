package co.geraldjaydlagarto.mydailytask.ui.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import co.geraldjaydlagarto.mydailytask.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun TaskDetailScreen() {
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
@Preview
private fun TopBar(modifier: Modifier = Modifier) {
    SmallTopAppBar(
        title = {
            Text(text = "Daily Tasks", style = MaterialTheme.typography.titleLarge)
        },
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Go Back"
            )
        },
        actions = {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Edit", style = MaterialTheme.typography.labelLarge)
            }
        }
    )
}

@Composable
private fun Content(modifier: Modifier = Modifier) {

}