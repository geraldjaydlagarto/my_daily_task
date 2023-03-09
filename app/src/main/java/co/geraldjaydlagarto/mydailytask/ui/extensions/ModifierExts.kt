package co.geraldjaydlagarto.mydailytask.ui.extensions

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.absolutePadding(
    size: Dp = 0.dp,
) = this.then(
    absolutePadding(size, size, size, size)
)