package br.com.fiap.global_solution.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.global_solution.R
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.TextField
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(navController: NavController) {

    val context = LocalContext.current
    val text = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-230).dp),
        contentAlignment = Alignment.Center
    ) {

        Column {
            Image(
                painter = painterResource(id = R.drawable.recife),
                contentDescription = "Recife Image"
            )
            Row(modifier = Modifier.fillMaxWidth()) { // Adiciona uma Row
                Spacer(modifier = Modifier.width(130.dp)) // Empurra o botão para a direita
                MonitorButton()
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {

            Card(
                modifier = Modifier
                    .offset(y = 320.dp)
                    .fillMaxWidth(),
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xfff9f6f6)),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {

                Column(
                    modifier = Modifier.padding(
                        vertical = 16.dp,
                        horizontal = 32.dp
                    )
                ) {
                }

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    TextField(
                        value = text.value,
                        onValueChange = { text.value = it },
                        label = { Text("Faça seu relatorio aqui") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp) // Aumenta a altura do TextField
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul))
                    ) {
                        Text(
                            text = "REGISTRAR",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }

}

@Composable
fun MonitorButton() {
    Button(onClick = { /* Aqui você pode iniciar a atividade de monitoramento ou qualquer outra funcionalidade que você deseja implementar */ }) {
        Text(text = "Monitorar Recife")
    }
}

