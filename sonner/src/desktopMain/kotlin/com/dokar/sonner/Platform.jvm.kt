package com.dokar.sonner

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp

internal actual fun currentNanoTime(): Long = System.nanoTime()

internal actual val CloseButtonSize: Dp = 20.dp

@Composable
internal actual fun ToasterPopup(
    alignment: Alignment,
    modifier: Modifier,
    offset: IntOffset,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = modifier
            .offset(x = offset.x.dp, y = offset.y.dp),
        contentAlignment = alignment
    ) {
        content()
    }
}
