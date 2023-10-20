package com.example.mascotafeliz.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(

    primary = OrangeDark,
    primaryContainer = Orange,
    secondary = BlueGreyDark,
    secondaryContainer = BlueGrey

)

private val LightColorScheme = lightColorScheme(

    primary = OrangeLight,
    primaryContainer = Orange,
    secondary = BlueGreyLight,
    secondaryContainer = BlueGrey

)

@Composable
fun MascotaFelizTheme(darkTheme: Boolean, content: @Composable () -> Unit) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes2,
        content = content
    )
}