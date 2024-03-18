public class Main {
    public static void main(String[] args) {
        System.out.println();

        const int a = 3;
const int b = 4;
const int c = 5;
const int d = 6;
const int e = 7;
const int f = 8;
const int g = 9;

// Pino do botão
const int botao = 2;

// Define os padrões de cada número (0 a 9) nos segmentos do display
const int digitos[10][7] = {
            {1, 1, 1, 1, 1, 1, 0}, // 0
            {0, 1, 1, 0, 0, 0, 0}, // 1
            {1, 1, 0, 1, 1, 0, 1}, // 2
            {1, 1, 1, 1, 0, 0, 1}, // 3
            {0, 1, 1, 0, 0, 1, 1}, // 4
            {1, 0, 1, 1, 0, 1, 1}, // 5
            {1, 0, 1, 1, 1, 1, 1}, // 6
            {1, 1, 1, 0, 0, 0, 0}, // 7
            {1, 1, 1, 1, 1, 1, 1}, // 8
            {1, 1, 1, 1, 0, 1, 1}  // 9
        };

        const int pinosDisplay[7] = {3, 4, 5, 6, 7, 8, 9}; // Pinos dos segmentos a g

        void setup() {
            pinMode(botao, INPUT); // Define o pino do botão como entrada
            Serial.begin(9600); // Inicia a comunicação serial para depuração
        }
        void exibeNumero(int num) {
            for (int j = 0; j < 7; j++) {
                digitalWrite(pinosDisplay[j], digitos[num][j]);
            }
        }
// Função principal
        void loop() {
            if (digitalRead(botao) == HIGH) { // Verifica se o botão foi pressionado
                // Contagem crescente
                for (int i = 0; i <= 9; i++) {
                    exibeNumero(i);
                    delay(900);
                }
                // Contagem decrescente
                for (int i = 9; i >= 0; i--) {
                    exibeNumero(i);
                    delay(900);
                }
            }
        }
    }
}