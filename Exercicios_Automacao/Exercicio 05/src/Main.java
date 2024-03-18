public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Declaração de Variáveis
        int vermelho1 = 3;
        int amarelo1 = 4;
        int verde1 = 5;

// Tempo inicial de ligação em milissegundos
        int tempoInicial = 5000;
// Tempo final de ligação em milissegundos
        int tempoFinal = 5;

        int i = tempoInicial;

//void Setup
        void setup() {
            pinMode(vermelho1, OUTPUT);
            pinMode(amarelo1, OUTPUT);
            pinMode(verde1, OUTPUT);
        }

//Void Loop
        void loop() {
            // Loop para ligar e desligar cada LED separadamente em sequência
            for (int tempoAtual = tempoInicial; tempoAtual >= tempoFinal; tempoAtual *= 0.8) {
                farolDasRuas(vermelho1, tempoAtual);
                farolDasRuas(amarelo1, tempoAtual);
                farolDasRuas(verde1, tempoAtual);
            }
        }

// Função para ligar e desligar um LED por um tempo específico
        void farolDasRuas(int cor, int tempo){
            digitalWrite(cor, HIGH); // Liga o LED
            delay(tempo);            // Espera o tempo especificado
            digitalWrite(cor, LOW);  // Desliga o LED
            delay(100);              // Pequeno atraso antes de prosseguir
        }
    }
}