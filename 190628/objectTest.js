var person={}
person.name ='zoetrope';
person.introduce = function () {
    return 'My name is '+this.name;
}
document.write(person.introduce());

/*
    객체 내의 변수 : property
    객체 내의 함수 : method
*/

var person1 =   {
    name : 'egoing',
    'introduce' : function () {
        return 'My name is '+this.name;
    }
}
document.write(person.introduce());

function Person() {}
var p = new Person();
p.name = 'zoetrope';
p.introduce = function () {
    return 'My name is '+this.name;
}
document.write(p.introduce());

function Person(name) {     // 초기화
    this.name = name;
    this.introduce = function () {
        return 'My name is '+this.name;
    }
}

var p1 = new Person('egoing');
document.write(p1.introduce()+"<br />");

var p1 = new Person('leezche');
document.write(p1.introduce()+"<br />");
