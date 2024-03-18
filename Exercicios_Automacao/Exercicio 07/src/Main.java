public class Main {
    public static void main(String[] args) {
        System.out.println();
        int ledPino = 3; // Pino do LED
        int botao = 2; // Pino do botão

        int estadoBotao = 0;
        int estadoAnterior = 0;
        int contadorCliques = 0;

// void Setup
        void setup() {
            pinMode(ledPino, OUTPUT);
            pinMode(botao, INPUT_PULLUP); // Habilita resistor de pull-up interno
        }

// Void Loop
        void loop() {
            estadoBotao = digitalRead(botao); // Lê o estado do botão

            // Verifica se houve uma mudança de estado no botão
            if (estadoBotao != estadoAnterior) {
                delay(50); // Aguarda um pequeno intervalo para evitar oscilações

                // Se o botão foi pressionado
                if (estadoBotao == LOW) {
                    contadorCliques++; // Incrementa o contador de cliques
                    piscarLED(contadorCliques); // Chama a função para fazer o LED piscar
                }
            }

            estadoAnterior = estadoBotao; // Atualiza o estado anterior do botão
        }

// Função para fazer o LED piscar um número de vezes
        void piscarLED(int vezes) {
            for (int i = 0; i < vezes; i++) {
                digitalWrite(ledPino, HIGH); // Liga o LED
                delay(500); // Aguarda 500ms
                digitalWrite(ledPino, LOW); // Desliga o LED
                delay(500); // Aguarda 500ms
            }
        }
    }
}