var MathOperations;
(function (MathOperations) {
    var circle;
    (function (circle) {
        var PI = 3.14;
        function circumference(radius) {
            console.log(2 * PI * radius);
        }
        circle.circumference = circumference;
        function areaOfCircle(radius) {
            console.log(PI * radius * radius);
        }
        circle.areaOfCircle = areaOfCircle;
    })(circle = MathOperations.circle || (MathOperations.circle = {}));
})(MathOperations || (MathOperations = {}));
var MathOperations;
(function (MathOperations) {
    var rectangle;
    (function (rectangle) {
        function area(length, breadth) {
            console.log("area of rectangle is:" + length * breadth);
        }
        rectangle.area = area;
        //    export function perimeter(length: number, breadth: number){
        //     console.log("perimeter of rectangle is:" +2*(length+breadth));
        //    }
    })(rectangle = MathOperations.rectangle || (MathOperations.rectangle = {}));
})(MathOperations || (MathOperations = {}));
/// <reference path="C:\Users\bhavana\Desktop\typescript-class\circle.ts"/>
/// <reference path="C:\Users\bhavana\Desktop\typescript-class\rectangle.ts"/>
MathOperations.circle.circumference(234);
MathOperations.rectangle.area(23, 24);
