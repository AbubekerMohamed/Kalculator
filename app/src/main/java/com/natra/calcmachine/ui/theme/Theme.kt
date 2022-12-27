package com.natra.calcmachine.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColors(
    primary = DarkPadBackground,
    primaryVariant = DarkBackground,
    secondary = OperatorColor,
    secondaryVariant = TextButtonColor,
    surface = DarkNumberColor
)

private val LightColorPalette = lightColors(
    primary = LightPadBackground,
    primaryVariant = LightBackground,
    secondary = OperatorColor,
    secondaryVariant = TextButtonColor,
    surface = LightNumberColor
)

@Composable
fun CalcmachineTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
    ) {
        content()
    }

}