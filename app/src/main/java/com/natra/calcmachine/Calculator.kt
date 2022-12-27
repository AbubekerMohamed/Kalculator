package com.natra.calcmachine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 3.dp,
    onAction: (CalculatorAction) -> Unit,
    onToggleTheme: () -> Unit
) {
    Box(modifier = modifier) {
        IconButton(onClick = { onToggleTheme() }) {
            Icon(
                Icons.Rounded.Refresh,
                contentDescription = "Change Theme"
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 3.dp),
                fontWeight = FontWeight.Light,
                fontSize = 45.sp,
                color = MaterialTheme.colors.surface,
                maxLines = 2
            )
            Column(
                modifier = Modifier.background(MaterialTheme.colors.primaryVariant).padding(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "AC",
                        modifier = Modifier
                            .aspectRatio(2f)
                            .weight(2f),
                        textColor = MaterialTheme.colors.secondaryVariant,
                        onClick = { onAction(CalculatorAction.Clear) })
                    CalculatorButton(symbol = "Del",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.secondaryVariant,
                        onClick = { onAction(CalculatorAction.Delete) })
                    CalculatorButton(symbol = "/",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.secondary,
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Divide)) })
                }// first row
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "7",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(7)) })
                    CalculatorButton(symbol = "8",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(8)) })
                    CalculatorButton(symbol = "9",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(9)) })
                    CalculatorButton(symbol = "*",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.secondary,
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Multiply)) })
                }// second row
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "4",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(4)) })
                    CalculatorButton(symbol = "5",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(5)) })
                    CalculatorButton(symbol = "6",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(6)) })
                    CalculatorButton(symbol = "-",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.secondary,
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Subtract)) })
                }// third row
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "1",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(1)) })
                    CalculatorButton(symbol = "2",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(2)) })
                    CalculatorButton(symbol = "3",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(3)) })
                    CalculatorButton(symbol = "+",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.secondary,
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Add)) })
                }// fourth row
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "0",
                        modifier = Modifier
                            .aspectRatio(2f)
                            .weight(2f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Number(0)) })
                    CalculatorButton(symbol = ".",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.surface,
                        onClick = { onAction(CalculatorAction.Decimal) })
                    CalculatorButton(symbol = "=",
                        modifier = Modifier
                            .aspectRatio(1f)
                            .weight(1f),
                        textColor = MaterialTheme.colors.secondary,
                        onClick = { onAction(CalculatorAction.Calculate) })
                }// fifth row
            }// column

        }
    }
}