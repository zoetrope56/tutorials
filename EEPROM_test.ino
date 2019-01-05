#include <EEPROM.h>

int addr=0;
int x=0;
byte val;

void setup() {
  Serial.begin(9600);
  randomSeed(analogRead(0));  //난수 생성기 초기화
  for(int i=0; i<10; i++) {   //EEPROM 초기화
      EEPROM.write(i, 0);
  }
}

void loop() {
    
  Serial.println("----Random Number Saved in EEPROM Test----");  
  int num = random(0, 1023)/4;  //난수 생성
  Serial.print("Random number : ");
  Serial.println(num);
  EEPROM.write(addr, num);    //EEPROM 데이터 저장
  
  val = EEPROM.read(addr);    //생성한 난수의 주소 확인
  Serial.print("Address : ");
  Serial.print(addr);
  Serial.print("\t");
  Serial.print("Data : ");
  Serial.println(val, DEC);

  addr += 1;
  if(addr == 10) {    //EEPROM 범위 지정 (0~9)
    addr=0;
    for(int i=0; i<10; i++) {
      EEPROM.write(i, 0);
    }
  }
    
  Serial.println("------------------------------------------");
  for(int i=0; i<=addr; i++) {    //리스트 출력
    val = EEPROM.read(i);
    Serial.print("Address : ");
    Serial.print(i,DEC);
    Serial.print("\t");
    Serial.print("Data : ");
    Serial.println(val, DEC);
  }
  Serial.print("------------------------------------------");
  delay(2000);
}
