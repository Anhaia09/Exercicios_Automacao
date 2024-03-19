public class Main {
    public static void main(String[] args) {
        System.out.println();
        int led = 3;
        int potPin = A0;
        int potValue = 0;
        int breatheTime = 0;

        void setup() {
            pinMode(led, OUTPUT);
            Serial.begin(9600);
        }

        void loop() {

            potValue = analogRead(potPin);

            breatheTime = map(potValue, 0, 1023, 0, 4000);

            if (breatheTime > 0) {
                for (int brightness = 0; brightness <= 255; brightness++) {
                    analogWrite(led, brightness);
                    delay(breatheTime / 512);
                }

                for (int brightness = 255; brightness >= 0; brightness--) {
                    analogWrite(led, brightness);
                    delay(breatheTime / 512);
                }
            }
        }
    }
}