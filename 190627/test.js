var pattern = /(\w+)\s(w+)/;

var str = "coding everybody";
var result = str.replace(pattern, "$2, $1");
// $2 $1은 각각 pattern의 두번째, 첫번째 (w+)
// ','는 공백을 의미 => '\s'

console.log(result);    // coding everybody

var result = str.replace(pattern, "$1, $1");
console.log(result);    // coding everybody

var result = str.replace(pattern, "$1, $2");
console.log(result);    // coding everybody
// 띠띠용

var urlPattern = /\b(?:https?):\/\/[a-z0-9-+&@#\/%?=~_|!:,.;]*/gim;

var content = '생활코딩 :  https://www.opentutorials.org/course/1 입니다. 네이버 : http://naver.com 입니다.';
var result = content.replace(urlPattern, function(url)  {
    return '<a href="'+url+'">'+url+'</a>';
});

console.log(result);
// 출력=>   생활코딩 :  <a href="https://www.opentutorials.org/course/1">https://www.opentutorials.org/course/1</a> 입니다. 네이버 : <a href="http://naver.com">http://naver.com</a> 입니다.

var vscope = 'global';
function fscope()   {
    var vscope = 'local';
    vscope = 'local';   // 지역 변수 vscope에 값 저장
    // var lv = 'local variables';
    alert(vscope);
}
fscope();       // local
alert(vscope);  // global
// alert(lv);   => error

function a()    {
    var i=0;    // for문의 i와 동일한 이름
}
for(var i=0; i<5; i++)  {
    a();        // i 값에 계속 0을 넣어주므로 무한반복
    document.write(i);
}
// *유효범위 : 변수의 수명

(function ()  {
    var MYAPP = {}  // function 함수의 지역변수가 된다.
    MYAPP.calculator = {
        'left' : null,
        'right' : null
    }
    MYAPP.coordinate = {
        'left' : null,
        'right' : null
    }

    MYAPP.calculator.left = 10;
    MYAPP.calculator.right = 20;

    function sum()  {
        return MYAPP.calculator.left + MYAPP.calculator.right;
    }
    document.write(sum());  // 30
}())    //익명함수 => 선언과 동시에 호출
// *자바스크립트의 지역변수는 함수에서만 유효하다.*

/*
    자바스크립트는 함수가 선언된 시점에서의 유효범위를 갖는다.
        ==> 정적 유효범위 (static scoping) / 렉시컬 (lexical scoping)
*/
var i = 5;  // 전역 변수
function a()    {
    var i=10;   // a함수 내의 지역 변수 i
    b();    // 5 출력
}
function b() {
    document.write(i);  // 전역 변수 i
}
a();    //=> 변수를 정적으로 값 할당하고 있으므로 정적 유효범위

function a() {}
a={
    b:function() {  // b:func => key(변수) : value(속성)
        // 함수는 객체의 값으로 포함가능
        // 객체의 속성값으로 담겨진 함수 = 메소드(method)
        
    }
}

function cal(func, num) {
    return func(num);   // 함수 호출값을 리턴
}
function increase(num) {
    return num+1;
}
function decrease(num) {
    return num-1;
}
alert(cal(increase, 1));    // 2
alert(cal(decrease, 1));    // 0

var process = [
    function(input){ return input + 10;},       // 11   =>  input=11
    function(input){ return input * input;},    // 11*11 = 121 => input=121
    function(input){ return input / 2;}         // 121/2 = 60.5 출력
];  // 순차적으로 실행
var input = 1;
for(var i = 0; i < process.length; i++){    //0, 1, 2
    input = process[i](input);      // i=1
}
alert(input);

function outter() {     // 외부 함수
    var title = 'coding everybody';
    function inner() {  // 내부 함수
        alert(title);
        
    }
    inner();    
}
outter();

function outter() {
    var title = 'coding everybody';
    return function () {    // 외부함수에서 내부함수를 리턴
        alert(title);       // 반환 시 함수 종료
        
    }    
}
inner = outter();
inner();

function factory_movie(title) {     // 지역 변수 title
    return {
        get_title : function()  {       // 내부 함수
            return title;
        },
        // 내부함수에서 지역변수 접근 가능
        set_title : function(_title)  {
            if(typeof(_title) === 'string')  {
                title = _title;
            } else  {
                alert(typeof _title);
                alert('제목은 문자열이어야 합니다.');
            }
            
        }
    }
}
vincent = factory_movie('Loving Vincent');
matrix = factory_movie('Matrix');

alert(vincent.get_title());
alert(matrix.get_title());

matrix.set_title('공각기동대'); // 띠띠용222
matrix.set_title(123456);

var arr =[]
for(var i=0; i<5; i++)  {
    arr[i] = function (id) {
        return function ()  {
            return i;
        }
    }(i);
}
for(var index in arr)   {
    console.log(arr[index]());
}









