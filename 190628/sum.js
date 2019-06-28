function sum() {
    var i, _sum=0;
    for(i=0; i<arguments.length; i++)   {
        document.write(i+' : '+arguments[i]+'<br />');
        _sum+=arguments[i];
    }
    
    return _sum;    
}
document.write('result : '+sum(1, 2, 3, 4));

/*
    --출력--
    0 : 1
    1 : 2
    2 : 3
    3 : 4
    result : 10
*/


sum.apply; // => ƒ apply() { [native code] }
           //    native code 내장된 코드

sum.apply(); // 0
sum.apply(null, [4, 2]);    // 6
sum.apply(null);    // ERROR!!

o1 = {val1:1, val2:2, val3:3}
o2 = {v1:10, v2:50, v3:100, v4:25}

function sum() {
    var _sum = 0;
    for(name in this)   {
        _sum += this[name];     // var this = o1, o2
    }
    return _sum;
}
o1 = {val1:1, val2:2, val3:3, sum:sum}
o2 = {v1:10, v2:50, v3:100, v4:25, sum:sum}
//  => sum함수도 더하기 때문에 6+sum함수코드 출력

alert(sum.apply(o1));    // 6
alert(sum.apply(o2));    // 185

function sum() {
    var _sum=0;
    for(name in this)   {
        if(typeof this[name] !== 'function')
            _sum += this[name];
    }

    return _sum;
}
o1 = {val1:1, val2:2, val3:3, sum:sum}
o2 = {v1:10, v2:50, v3:100, v4:25, sum:sum}
alert(o1.sum());    // 6
alert(o2.sum());    // 185

