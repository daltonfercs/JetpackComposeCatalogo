package com.daltonfercs.jetpackcomposecatalogo

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daltonfercs.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCatalogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyComplexLayaout()
                }
            }
        }
    }
}

@Composable
fun MyComplexLayaout(){
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ){
            Text(text = "Hi Sample 1")
        }
        
        MySapacer(size = 30)

        Row (
            Modifier
                .fillMaxSize()
                .weight(1f)){
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Blue), contentAlignment = Alignment.Center){
                Text(text = "Hi Sample2")
            }
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red), contentAlignment = Alignment.Center
            ){
                Text(text = "Hi My Name is Dalton")
            }
        }
        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Magenta), Alignment.BottomCenter){
            Text(text = "Hi Sample3")
        }

    }
}

@Composable
fun MySapacer(size:Int){
    Spacer(modifier = Modifier.height(size.dp))
}
@Composable
fun MyRow(){
    Row (Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween){
        Text(text = "ejemplo 1")
        Text(text = "ejemplo 2")
        Text(text = "ejemplo 3")
    }
}

@Composable
fun MyColum(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Ejemplo1", modifier = Modifier.background(Color.Cyan))
        Text(text = "Ejemplo2")
        Text(text = "Ejemplo3")
        Text(text = "Ejemplo4")

    }


}

@Composable
fun MyBox(name: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd){
        Box(modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .background(Color.Cyan) ){
            Text(text = "esto es un ejemplo")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeCatalogoTheme {
        MyComplexLayaout()
    }
}