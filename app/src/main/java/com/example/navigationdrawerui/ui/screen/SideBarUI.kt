package com.example.navigationdrawerui.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import com.example.navigationdrawerui.R
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.navigationdrawerui.ui.theme.SidebarItemColor

    @Composable
    fun SidebarUI() {
        Column(
            modifier = Modifier.padding(top = 60.dp, start = 10.dp)
        ) {
            SideBarItem(icon = R.drawable.profile, text = "Profile")
            SideBarItem(icon = R.drawable.home, text = "Home Page")
            SideBarItem(icon = R.drawable.cart, text = "My Cart")
            SideBarItem(icon = R.drawable.heart, text = "Favorite")
            SideBarItem(icon = R.drawable.orders, text = "Orders")
            SideBarItem(icon = R.drawable.notifications, text = "Notifications")
            Spacer(
                modifier = Modifier
                    .padding(start = 14.dp)
                    .padding(vertical = 10.dp)
                    .width(160.dp)
                    .height(2.dp)
                    .background(color = SidebarItemColor)
            )
            SideBarItem(icon = R.drawable.signout, text = "Sign Out")
        }
    }




@Composable
private fun SideBarItem(icon: Int, text: String) {
    TextButton(onClick = {}) {
        Row(
            modifier = Modifier.padding(all = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "",
                modifier = Modifier
                    .size(26.dp)
                    .padding(end = 6.dp),
                tint = SidebarItemColor

            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = text,
                color = SidebarItemColor
            )
        }
    }
}
