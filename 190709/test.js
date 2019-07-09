// 객체가 아닌 데이터 타입 : 원시 데이터 타입(primitive type)
// 숫자, 문자열, 논리형(true / false), null, undefined => 객체인 데이터 타입

var str = 'coding';
console.log(str.length);        // 6
console.log(str.charAt(0));     // c
// ~~. <== . : Object access Operator

/**
 * 문자열은 property, method가 있다. 하지만 내부적으로 원시 데이터 타입이고
 * 자바스크립트는 문자열 관련 작업을 처리할 때 임시로 문자열 객체를 만들고
 * 사용이 끝나면 제거한다 => 내부적으로 일어남, 문자열은 객체가 아님
 *  */

var str = 'coding';
// str = new String('coding'); 과 같이 처리(내부적으로 임시 객체 생성)

console.log(str.length);        // 6    => 임시 객체가 갖고있는 길이
console.log(str.charAt(0));     // c    => 임시 객체가 갖고있는 메소드 사용

var str = 'coding';
str.prop = 'everybody';
/**
 * prop를 하는 순간 내부적으로 String 객체 생성
 * 그러나 prop프로퍼티가 이 객체에 저장되고 이 객체는 곧 제거된다.(= 원시 데이터 타입으로 돌아감)
 *      ==> prop이라는 속성이 저장된 객체 존재x
 *          ==> wrapper object(Number, String, Boolean)
 */
console.log(str.prop);      // undefined




