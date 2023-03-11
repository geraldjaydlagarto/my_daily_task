package co.geraldjaydlagarto.mydailytask.ui.edit

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import co.geraldjaydlagarto.mydailytask.R
import co.geraldjaydlagarto.mydailytask.ui.extensions.absolutePadding


@Composable
fun AddEditContent(
    modifier: Modifier = Modifier,
    onCancel: () -> Unit = {},
    onSaveTask: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // put states here
        ContentTitleInputSection()
        ContentLengthInputSection()
        ContentThemeInputSection()
        Spacer(modifier = Modifier.weight(1f))
        Row(
        ) {
            TextButton(
                modifier = Modifier.weight(1f),
                onClick = { onCancel() }) {
                Text(text = "Cancel")
            }
            Button(
                modifier = Modifier.weight(1f),
                onClick = { onSaveTask() }) {
                Text(text = "Save")
            }
        }
    }
}

@Composable
private fun ContentTitleInputSection() {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        textStyle = MaterialTheme.typography.titleMedium,
        value = "Design the app", onValueChange = {})
}

@Composable
private fun ContentLengthInputSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
            .absolutePadding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_schedule_24),
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Length"
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "120 Minutes",
            textAlign = TextAlign.End
        )
    }
}

@Composable
private fun ContentThemeInputSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
            .absolutePadding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_color_lens_24),
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Theme"
        )
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier
                .size(24.dp)
                .background(color = Color.Yellow)
                .border(width = 1.dp, color = Color.Gray)
        )
    }
}
