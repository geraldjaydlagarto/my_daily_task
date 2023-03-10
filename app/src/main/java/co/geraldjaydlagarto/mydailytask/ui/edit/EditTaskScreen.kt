package co.geraldjaydlagarto.mydailytask.ui.edit

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun EditTaskScreen(
    onBack: () -> Unit = {},
    onDeleteTask: () -> Unit = {},
    onSaveTask: () -> Unit = {},
) {
    Scaffold(
        topBar = {
            TopBar(onBack = onBack, onDeleteTask = onDeleteTask)
        }
    ) {
        AddEditContent(
            modifier = Modifier.padding(it),
            onCancel = onBack,
            onSaveTask = onSaveTask
        )
    }
}

@Composable
@Preview
private fun TopBar(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {},
    onDeleteTask: () -> Unit = {}
) {
    SmallTopAppBar(
        title = {
            Text(text = "Edit Task")
        },
        actions = {
            IconButton(onClick = { onDeleteTask() }) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Add task",
                    tint = Color.Red
                )
            }
        }
    )
}



