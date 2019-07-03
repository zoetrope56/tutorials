function func() {
    if(window == this)  {
        console.log("window === this");
    }
}
func();     // window === this

var o = {
    func : function()   {
        if(o === this)  {
            document.write("o === this");
        }
    }
}
o.func();   // o === this

var funcThis = null; 
 
function Func(){
    funcThis = this;
}
/*
    생성자로 호출될 때에는 생성될 객체를 가리킴
    일반 함수로  호출될 때에는 window를 가리킴
*/
var o1 = Func();        // 일반 함수 호출
if(funcThis === window){
    document.write('window <br />');
}
 
var o2 = new Func();    // new를 통해서 호출했기 때문에 생성자로 주는 것
if(funcThis === o2){
    document.write('o2 <br />');
}

document.write(o1+': o1 <br />');   // undefined: o1 
document.write(o2+': o2 <br />');   // [object Object]: o2

// sum 이라는 함수 객체 생성    == 함수 리터럴(literal)
function sum(x, y) {
    return x+y;
}
sum(1, 2);  // 3

var sum2 = new Function('x', 'y', 'return x+y');
sum(1, 2);  // 3

function func(){
	alert('hello?');
}

func();
window.func();
// window 	=> 전역 객체(생략 가능)
// func	=> window라는 전역객체에ㅔ 모든 변수와 함수가 소속됨

var o = {}
var p = {}
function func() {
    switch (this) {
        case o:
            document.write('o<br />');
            break;
        case p:
            document.write('p<br />');
            break;
        case window:    // default => window
            document.write('window<br />');
            break;
    }
}
//this는 함수 내에서 함수 호출 맥락(context)를 의미한다.
func();         // window
func.apply(o);  // o    apply 첫번째인자로 o라는 context(문맥)를 주게됨
func.apply(p);  // p

function Person(name){
    this.name = name;
}
Person.prototype.name=null;
Person.prototype.introduce = function(){
    return 'My name is '+this.name; 
}

function Programmer(name) {
    this.name = name;
}
Programmer.prototype = new Person();        // prototype이라고 하는 속성안의 객체와 같은 객체를 리턴해줌

var p1 = new Programmer('zoetrope');
document.write(p1.introduce()+"<br />");

Programmer.prototype = new Person();
Programmer.prototype.coding = function(){
    return "hello world";
}
 
var p1 = new Programmer('egoing');
document.write(p1.introduce()+"<br />");
document.write(p1.coding()+"<br />");


function Ultra(){}
Ultra.prototype.ultraProp = true;
 
function Super(){}
Super.prototype = new Ultra();
 
function Sub(){}
Sub.prototype = new Super();
 
var o = new Sub();      // Sub 객체 생성
console.log(o.ultraProp);






