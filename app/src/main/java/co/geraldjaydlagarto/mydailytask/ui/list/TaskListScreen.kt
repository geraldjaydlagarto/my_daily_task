package co.geraldjaydlagarto.mydailytask.ui.list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.geraldjaydlagarto.mydailytask.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
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
@Preview
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
    LazyColumn(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
            .fillMaxSize()
    ) {
        item {
            DailyTaskItem()
        }
    }
}

@Composable
@Preview
private fun DailyTaskItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .heightIn(54.dp)
            .absolutePadding(
                left = 8.dp,
                top = 8.dp,
                right = 8.dp,
                bottom = 8.dp
            )
            .clickable {

            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            modifier = Modifier.weight(1f),
            style = MaterialTheme.typography.titleMedium,
            text = "Design the app",
        )
        Text(
            text = "120",
            style = MaterialTheme.typography.labelMedium
        )
        Icon(
            painter = painterResource(id = R.drawable.baseline_schedule_24),
            contentDescription = "Duration"
        )
        Icon(
            painter = painterResource(id = R.drawable.baseline_chevron_right_24),
            contentDescription = null
        )
    }
}



