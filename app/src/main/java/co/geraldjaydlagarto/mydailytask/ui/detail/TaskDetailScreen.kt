package co.geraldjaydlagarto.mydailytask.ui.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.geraldjaydlagarto.mydailytask.R
import kotlin.text.Typography

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
@Preview
private fun Content(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.Yellow, shape = RoundedCornerShape(16.dp)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        ContentTimeSection(
            modifier = Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp
            )
        )
        ContentCountdownSection(modifier = Modifier.padding(horizontal = 16.dp))
        ContentControlsSection(
            modifier = Modifier.padding(
                start = 16.dp,
                bottom = 16.dp,
                end = 16.dp
            )
        )
    }
}

@Composable
private fun ContentTimeSection(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Minutes Elapsed")
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_hourglass_bottom_24),
                    contentDescription = null
                )
                Text(text = "19")
            }
        }
        Column(horizontalAlignment = Alignment.End) {
            Text(text = "Minutes Remaining")
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "101")
                Icon(
                    painter = painterResource(id = R.drawable.baseline_hourglass_top_24),
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
@Preview
private fun ContentCountdownSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Design the app", style = MaterialTheme.typography.headlineLarge)
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "101", style = MaterialTheme.typography.displayLarge)
                Text(text = "Minutes")
            }
            Text(text = ":", style = MaterialTheme.typography.displayLarge)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "45", style = MaterialTheme.typography.displayLarge)
                Text(text = "Seconds")
            }
        }
    }
}

@Composable
@Preview
private fun ContentControlsSection(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.baseline_stop_circle_24),
                contentDescription = "Stop"
            )
        }
        Spacer(modifier = Modifier.width(24.dp))
        IconButton(
            modifier = Modifier.size(72.dp),
            onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.baseline_play_circle_24),
                contentDescription = "Play"
            )
        }
        Spacer(modifier = Modifier.width(24.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.baseline_pause_circle_24),
                contentDescription = "Pause"
            )
        }
    }
}