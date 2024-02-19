package com.example.tarjetapresentacion_infomovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarjetapresentacion_infomovil.ui.theme.TarjetaPresentacion_INFOMOVILTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacion_INFOMOVILTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tarjeta()
                }
            }
        }
    }
}

@Composable
fun Tarjeta() {
    Column(){
        ParteTarjeta1(
            nombre = "Mario Gil",
            titulo = "Estudiante de Informática Móvil",
            backgroundColor = Color(0xFFEADDFF),
            modifier = Modifier.padding(10.dp)
        )
        ParteTarjeta2(
            backgroundColor = Color(0xFFEADDFF),
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Composable
fun ParteTarjeta1(
    nombre: String,
    titulo: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = nombre,
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = titulo,
            modifier = Modifier.padding(8.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun ParteTarjeta2(
    backgroundColor: Color,
    modifier : Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Contacto(
            texto = "123456789",
            modifier = modifier,
            auxiliar = Icons.Rounded.Call
        )
        Contacto(
            texto = "magilssa@unirioja.es",
            modifier = modifier,
            auxiliar = Icons.Rounded.Email
        )
        Contacto(
            texto = "Edificio CCT : Cafeteria",
            modifier = modifier,
            auxiliar = Icons.Rounded.Home
        )
    }
}

@Composable
fun Contacto(
    texto: String,
    modifier : Modifier = Modifier,
    auxiliar: ImageVector
){
    Row(){
        val image = painterResource(R.drawable.baseline_account_circle_white_24dp)
        Icon(
            auxiliar,
            contentDescription = null,
            modifier = Modifier.padding(10.dp))
        Text(
            text = texto,
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacion_INFOMOVILTheme {
        Tarjeta()
    }
}