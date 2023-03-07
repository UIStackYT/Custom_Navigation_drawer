package com.example.navigationdrawerui.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import com.example.navigationdrawerui.R
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationdrawerui.ui.theme.Poppins
import com.example.navigationdrawerui.ui.theme.PrimaryColor
import com.example.navigationdrawerui.ui.theme.SecondaryColor
import com.example.navigationdrawerui.ui.theme.Shapes

    @Composable
    public fun MainScreenUI(
        drawerState: Boolean,
        modifier: Modifier,
        onToggle: () -> Unit
    ) {

        Column(
            modifier = modifier
                .background(color = Color.White)
                .padding(16.dp)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { onToggle() }) {
                    Icon(
                        painter = if (drawerState) {
                            painterResource(id = R.drawable.back)
                        } else {
                            painterResource(id = R.drawable.menu)
                        },
                        contentDescription = "",
                        modifier = Modifier.size(36.dp),
                        tint = PrimaryColor
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.bell),
                        contentDescription = "",
                        modifier = Modifier.size(32.dp),
                        tint = PrimaryColor
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shoes),
                    contentDescription = "",
                    modifier = Modifier.padding(top = 50.dp, bottom = 40.dp)
                )
            }
            Text(
                text = "Step Up Your Style: The Perfect Pair of Shoes",
                fontFamily = Poppins,
                modifier = Modifier.padding(horizontal = 4.dp, vertical = 8.dp),
                color = PrimaryColor
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$ 25.0",
                    fontFamily = Poppins,
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 8.dp),
                    fontSize = 26.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Left,
                    color = PrimaryColor
                )
                Button(
                    onClick = { },
                    modifier = Modifier
                        .clip(Shapes.medium),
                    colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryColor),
                    contentPadding = PaddingValues(vertical = 6.dp, horizontal = 16.dp)
                ) {
                    Text(
                        text = "Add To Cart",
                        fontSize = 12.sp,
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),
                        fontFamily = Poppins
                    )
                }
            }

            Text(
                text = "Elevate your everyday look with a versatile and comfortable pair of shoes." +
                        " Perfect for both casual and formal occasions, our shoes feature " +
                        "high-quality materials and expert craftsmanship, ensuring durability " +
                        "and a perfect fit. With a range of styles, colors and designs to choose " +
                        "from, you're sure to find the perfect pair to match your personal sense of " +
                        "fashion.",
                modifier = Modifier.padding(horizontal = 4.dp, vertical = 8.dp),
                fontWeight = FontWeight.Light,
                fontSize = 16.sp,
                color = SecondaryColor
            )
        }


    }
