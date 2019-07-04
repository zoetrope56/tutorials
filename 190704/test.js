function Ultra() {}
Ultra.prototype.ultraProp = true;

function Super() {}
Super.prototype = new Ultra();

function Sub(){}
Sub.prototype = new Super();

var o = new Sub();
console.log(o.ultraProp);   // true

/**
 *      객체 o에서 ultraProp를 찾는다.
 *      없다면 Sub.prototype.ultraProp를 찾는다.
 *      없다면 Super.prototype.ultraProp를 찾는다.
 *      없다면 Ultra.prototype.ultraProp를 찾는다.
 */

function Ultra() {}
Ultra.prototype.ultraProp = true;

function Super() {}
var t = new Ultra();
t.ultraProp = 4;
Super.prototype = t;

function Sub(){}
var s = new Super();
Sub.prototype = s;

var o = new Sub();
console.log(o.ultraProp);   // 4


var arr = new Array('seoul','new york','ladarkh','pusan', 'Tsukuba');
// 랜덤하게 값 가져오기
function getRandomValueFromArray(haystack){
    var index = Math.floor(haystack.length*Math.random());
        // floor : 소숫점 제거 => 정수
        // arr의 크기보다 작은 index값이 만들어짐
    return haystack[index]; 
}
console.log(getRandomValueFromArray(arr));
//
Array.prototype.random = function() {
    var index = Math.floor(arr.length*Math.random());
    return this[index];
}
var arr = new Array('seoul','new york','ladarkh','pusan', 'Tsukuba');
console.log(arr.random());
// 랜덤하게 실행


var grades = {'egoing':10, 'k8805':6, 'sorialgi':80};
// prototype : 객체의 원형


Object.prototype.contain = function(neddle) {
    for(var name in this){      // this : 메소드가 소속되어 있는 객체를 의미
        if(this[name] === neddle){
            return true;
        }
    }
    return false;
}
var o = {'name':'egoing', 'city':'seoul'}
console.log(o.contain('egoing'));       // true
//console.log(o.contain('grapittie'));     false
var a = ['egoing','leezche','grapittie'];
console.log(a.contain('leezche'));      // true
 

for(var name in o)	{
	console.log(o[name]);   //  egoing seoul
}
/*
    ƒ (neddle) {
        for(var name in this){
            if(this[name] === neddle){
                return true;
            }
        }
        return false;
    }
    // Object.~~.~~ => Object는 모든 객체(+함수)를 정의하기 때문
*/

for(var name in o)	{
	console.log(name);      //  name city contain
}
for(var name in o)  {
    if(a.hasOwnProperty(name)){     // name 값이 객체가 갖고있는지 검사
        console.log(name);  // 0, 1, 2
    }
}


