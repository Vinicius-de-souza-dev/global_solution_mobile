package br.com.fiap.global_solution.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.global_solution.R
import br.com.fiap.global_solution.ui.theme.Global_solutionTheme

@Composable
fun LoginScreen(navController: NavController) {

    var text = remember { mutableStateOf("") }

    var senha = remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // ---- header ---------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(colorResource(id = R.color.azul))
            ) {


                Text(
                    text = "Login",
                    fontSize = 36.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 24.dp)
                        .offset(y = (20).dp)
                )
            }

        }
        // --- formulário
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {

            Card(
                modifier = Modifier
                    .offset(y = (130).dp)
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
                    Text(
                        text = "Seus dados",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.azul),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        text = "Login",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.azul)
                    )
                    OutlinedTextField(
                        value = text.value,
                        onValueChange = { text.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Seu e-mail")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        ),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Senha",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.azul)
                    )
                    OutlinedTextField(
                        value = senha.value,
                        onValueChange = { senha.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(
                                text = "Sua senha"
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        ),

                        visualTransformation = PasswordVisualTransformation(),

                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            navController.navigate("home")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul))
                    ) {
                        Text(
                            text = "ENTRAR",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                    val uriHandler = LocalUriHandler.current
                    ClickableText(
                        text = AnnotatedString("Esqueceu sua senha ?"),
                        modifier = Modifier
                            .offset(y = 5.dp)
                            .padding(start = 180.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.verde),
                            fontSize = 10.sp
                        ),
                        onClick = {
                            navController.navigate("senha")
                        }
                    )

                    ClickableText(
                        text = AnnotatedString("Faça seu cadastro aqui"),
                        modifier = Modifier
                            .offset(y = 10.dp)
                            .padding(start = 180.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.verde),
                            fontSize = 10.sp
                        ),
                        onClick = {
                            navController.navigate("cadastro")
                        }
                    )


                }


            }
        }
    }
}