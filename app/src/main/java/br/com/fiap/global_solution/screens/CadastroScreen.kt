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

@Composable
fun CadastroScreen(navController: NavController) {

    var text = remember { mutableStateOf("") }

    var email = remember { mutableStateOf("") }

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
                    text = "Cadastro",
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
                        text = "Faça seu cadastro",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.azul),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        text = "Seu Nome",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.azul)
                    )
                    OutlinedTextField(
                        value = email.value,
                        onValueChange = { email.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(
                                text = "Seu nome"
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "E-mail",
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
                            Text(
                                text = "Seu e-mail"
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        )
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
                    Text(
                        text = "Confirme sua senha",
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
                                text = "Confirme sua senha"
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
                            navController.navigate("Login")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul))
                    ) {
                        Text(
                            text = "CADASTRAR",
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