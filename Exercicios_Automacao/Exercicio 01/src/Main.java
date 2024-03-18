public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}
//Declarar as variáveis

int a = 3;
int b = 4;
int c = 5;
int d = 6;
int e = 7;
int f = 8;
int g = 9;


int incremento = 0;
int botao = 2;
bool sequenciaAutomatica = false;


void setup() {

    pinMode(botao,INPUT);
    for (int i = 3; i<=9; i++){
        pinMode(i,OUTPUT);

    }
    Serial.begin(9600);
}


void loop(){

    bool estadoBotao = digitalRead(botao);

    if (estadoBotao == 1){
        sequenciaAutomatica = true;
        incremento = 0;
        delay(500);

    }
    if (sequenciaAutomatica) {
        incremento++; // Decrementa o valor
        if (incremento<0) {
            sequenciaAutomatica = false;

        }
        delay(900); // Intervalo entre os LEDs
    }

    ligaLeds(incremento);
}

void ligaLeds (int numero){

    Serial.println(numero);

    switch (numero)

    {

        case 0:

            for (int i=3; i <=8; i++){

                digitalWrite(i,1);

            }

            digitalWrite(g,0);

            break;



        case 1:

            for (int i=3; i <=9; i++){

                if(i == 4 || i == 5){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;


        case 2:

            for (int i=3; i <=9; i++){

                if(i == 3 || i == 4 || i == 6 || i == 7 || i == 9){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;


        case 3:

            for (int i=3; i <=9; i++){

                if(i == 3 || i == 4 || i == 5 || i == 6 || i == 9){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;


        case 4:

            for (int i=3; i <=9; i++){

                if(i == 4 || i == 5 || i == 8 || i == 9){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;


        case 5:

            for (int i=3; i <=9; i++){

                if(i == 3 || i == 5|| i == 6 || i == 8 || i == 9){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;


        case 6:

            for (int i=3; i <=9; i++){

                if(i == 3 || i == 5|| i == 6 || i == 7 || i == 8 || i == 9){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;


        case 7:

            for (int i=3; i <=9; i++){

                if(i == 3 || i == 4|| i == 5){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;



        case 8:

            for (int i=3; i <=9; i++){

                digitalWrite(i,1);

            }

            break;


        case 9:

            for (int i=3; i <=8; i++){

                if(i == 3 || i == 4|| i == 5 || i == 6 || i == 8 || i == 9){

                    digitalWrite(i,1);

                }else{

                    digitalWrite(i,0);

                }

            }

            break;


        default:

            for (int i=3; i <=9; i++){

                digitalWrite(i,0);

            }

            incremento = 0;

            break;

    }

}