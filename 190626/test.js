var str = 'a';

var pattern = /a/;
var pattern = new RegExp('a');

console.log(pattern.exec('abcdef'));    // ["a"]
console.log(pattern.exec('bcdefg'));    // a가 없기 때문에 null 출력

var pattern = /a./;     // . => 문자
pattern.exec('abcde');  // a.  => ["ab"]    . => b

pattern.exec('bcdef');  // null

pattern.test('abcde');  // a 존재o : true
pattern.test('bcde');   // a 존재x : false

var pattern = /a/;
var str = 'abcdef';
str.match(pattern); // ["a"]

str.replace(pattern, 'A');  // "Abcdef"

var xi = /a/;
console.log("Abcde".match(xi));     // null

var oi = /a/i;

console.log("Abcde".match(oi));     // ["A"]

var xg = /a/;
"abcdea".match(xg);     //["a"]

var og = /a/g;
"abcdea".match(og);     //(2) ["a", "a"]

var ig = /a/ig;
"AabcdAa".match(ig);    //(4) ["A", "a", "A", "a"]

