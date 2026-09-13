package com.example.simplechoices

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppScreen(
    decisions: List<Decision>,
    modifier: Modifier = Modifier
) {
    var randDecision: Int by remember {mutableIntStateOf((1..100).random())}
    var currentDecision: Decision by remember {mutableStateOf(Decision("", 0))}
    var clickCounter: Int by remember {mutableIntStateOf(0)}
    var showResults: Boolean by remember {mutableStateOf(false)}
    var resultString by remember { mutableStateOf("") }

    val yesGo = "YES, You Should Go!"
    val noGo = "NO, You Shouldn't Go!"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "StudentID: 1886935, CCID: leighan",
            fontSize = 16.sp,
            color = Color(100,38,20)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Box (modifier = Modifier
            .background(color = Color(225,6,70),
                shape = RoundedCornerShape(10.dp))
            .padding(all = 16.dp),
            contentAlignment = Alignment.Center
        )
        {
            Text(
                "Simple Choices",
                fontSize = 30.sp,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp)
            )
        }

        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "Feel like going? Choose vibe below:",
            fontSize = 20.sp,
            color = Color(100,38,20)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.padding(all = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            for(decision in decisions) {
                DecisionButton(
                    decision = decision,
                    decisionClicked = {decision ->
                        currentDecision = decision
                        clickCounter++
                        showResults = true
                        resultString = if(randDecision < decision.getPercentage()) yesGo else noGo
                        randDecision = (1..100).random()
                    }
                )
                Spacer(modifier = Modifier.width(12.dp))
            }
        }

        if(showResults){
            Row(modifier = Modifier.padding(all = 20.dp)){
                Spacer(modifier = Modifier.height(50.dp))

                Box(
                    modifier = Modifier
                        .background(color = Color(225,6,70),
                            shape = RoundedCornerShape(10.dp))
                        .padding(all = 16.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = resultString,
                        fontSize = 30.sp
                    )

                }
            }
        }

        Text(
            text = "Clicks: $clickCounter",
            fontSize = 30.sp,
            color = Color(100,38,20)
        )
    }
}